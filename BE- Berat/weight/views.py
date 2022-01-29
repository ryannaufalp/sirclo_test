from django.shortcuts import render, redirect  
from weight.forms import WeightForm  
from weight.models import WeightRecord
from operator import itemgetter

# Create your views here.  
def create(request):  
    if request.method == "POST":  
        form = WeightForm(request.POST)
        if form.is_valid():  
            try:  
                form.save()  
                return redirect('/list')  
            except:  
                pass
    else:  
        form = WeightForm()  
    return render(request,'create.html',{'form':form})

def list(request):  
    weightRecords = WeightRecord.objects.all()
    listRecords = []
    average = {}
    average["maxWeight"] = 0
    average["minWeight"] = 0
    average["difference"] = 0
    for item in weightRecords:
        records = {}
        records["id"] = item.id
        records["createdAt"] = item.createdAt
        records["maxWeight"] = item.maxWeight
        records["minWeight"] = item.minWeight
        records["difference"] =  int(item.maxWeight) - int(item.minWeight)
        average["maxWeight"] += int(item.maxWeight)
        average["minWeight"] += int(item.minWeight)
        average["difference"] += int(item.maxWeight) - int(item.minWeight)
        listRecords.append(records)
    listRecords.sort(key=itemgetter('createdAt'), reverse=True)
    average["maxWeight"] /= len(weightRecords)
    average["minWeight"] /= len(weightRecords)
    average["difference"] /= len(weightRecords)
    return render(request,"list.html",{'listRecords':listRecords, 'average': average})

def edit(request, id):  
    weightRecord = WeightRecord.objects.get(id=id)
    return render(request,'edit.html', {'weightRecord':weightRecord})
    
def detail(request, id):  
    weightRecord = WeightRecord.objects.get(id=id)
    difference = int(weightRecord.maxWeight) - int(weightRecord.minWeight)
    return render(request,'detail.html', {'weightRecord':weightRecord, 'difference': difference})

def update(request, id):  
    weightRecord = WeightRecord.objects.get(id=id) 
    form = WeightForm(request.POST, instance = weightRecord)

    if form.is_valid():  
        form.save()  
        return redirect("/list")

    return render(request, 'edit.html', {'weightRecord': weightRecord})
    
def back(request, id):  
    return redirect("/list")


def delete(request, id):  
    weightRecord = WeightRecord.objects.get(id=id)
    weightRecord.delete()  
    return redirect("/list")
