from django.urls import path
from generator_server.generator.views import generate_match_end_result_event

urlpatterns = [
    path('generate-matches/', generate_match_end_result_event, name='generate-match'),
]
