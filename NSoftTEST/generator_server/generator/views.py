# matches/views.py

import random
from rest_framework import status
from rest_framework.decorators import api_view
from rest_framework.response import Response
from generator_server.generator.models import Match
from generator_server.generator.fixtures import club_names
from generator_server.generator.generators import match_end_result_generator
from generator_server.generator.serializers import MatchSerializer
from django.utils.decorators import method_decorator
from django.views.decorators.csrf import csrf_exempt


@method_decorator(csrf_exempt, name='dispatch')
@api_view(['GET'])
def generate_match_end_result_event(request):

    # Visiting this endpoint will start generator of random match result

    match_data = match_end_result_generator()

    return Response({"message": "Match generation started."})

