from django.test import TestCase
from django.test import Client
from django.urls import resolve
from django.http import HttpRequest
from .models import WeightRecord


class WeightTest(TestCase):
    
    def test_create(self):
        response = Client().post('/create', {'createdAt': '2022-01-29', 'maxWeight': '121', 'minWeight': '20'})
        self.assertEqual(response.status_code, 302)
        response = Client().get('/list')
        html_response = response.content.decode('utf8')
        self.assertIn('Jan. 29, 2022',html_response)
        self.assertIn('121',html_response)
        self.assertIn('20',html_response)
        
    def test_update(self):
        weightRecord = WeightRecord.objects.create(createdAt= '2022-01-29', maxWeight= '121', minWeight= '20')
        response = Client().post('/update/' + str(weightRecord.id), {'createdAt': '2022-01-30', 'maxWeight': '144', 'minWeight': '30'})
        self.assertEqual(response.status_code, 302)
        response = Client().get('/list')
        html_response = response.content.decode('utf8')
        self.assertIn('Jan. 30, 2022',html_response)
        self.assertIn('144',html_response)
        self.assertIn('30',html_response)
    
    def test_delete(self):
        weightRecord = WeightRecord.objects.create(createdAt= '2022-01-29', maxWeight= '121', minWeight= '20')
        response = Client().post('/delete/' + str(weightRecord.id))

        self.assertEqual(response.status_code, 302)
        self.assertNotIn(weightRecord, WeightRecord.objects.all())

