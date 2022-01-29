
# Search Movie App Project

This project is simple CRUD Python application that record weight.

## Installation
To get the project up and running, and view components in the browser, complete the following steps:

1. Download and install Python 3.6
 
2. Install project dependancies: 
`python -m venv env`
`env\Scripts\activate.bat`
`pip install -r requirements.txt`

3. Run migration for database sqlite3:
`python manage.py makemigrations`
`python manage.py migrate`

4. Run application :
`python manage.py runserver 8000`

5. Open your browser and visit <http://localhost:8000>

6. If you want to run unit test :
`python manage.py test`



## How to Use App

Create new data by click button 'add new record'. Fill the form and save the data. 
Click detail button to see detail page. 
Click edit button to edit the data. Fill the form and save the edited data.
Click delete button if you want to delete data.
