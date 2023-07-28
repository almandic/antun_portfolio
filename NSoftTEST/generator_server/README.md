Hello. This is a python generator set up as a django project

To run this project, first run the following commands to install the dependencies:

```bash 
poetry shell
```
to create a virtual environment
and then
```bash
poetry install
```

Then, run the following command to run the server:

```bash
poetry run python manage.py runserver
```

To activate the generator, visit endpoint with curl:
    
```bash
curl --url http://127.0.0.1:8000/api/v1/generate-matches/
```