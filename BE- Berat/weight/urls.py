from django.contrib import admin  
from django.urls import path  
from weight import views

urlpatterns = [  
    path('', views.list),
    path('list', views.list),  
    path('create',views.create),
    path('detail/<int:id>', views.detail),
    path('edit/<int:id>', views.edit),  
    path('update/<int:id>', views.update),  
    path('delete/<int:id>', views.delete),  
]  