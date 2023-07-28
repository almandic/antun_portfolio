import random
import time
import requests
import uuid

from generator_server.generator.fixtures import club_names


# Generator function for match-end-result-event
def match_end_result_generator():
    while True:
        match_id = str(uuid.uuid4())

        club1 = random.choice(club_names)
        club_names.remove(club1)  # Assert that club1 != club2
        club2 = random.choice(club_names)
        club_names.append(club1)  # Restore club_name

        match_name = f"{club1} - {club2}"
        end_result = f"{random.randint(0, 7)} : {random.randint(0, 7)}"

        match_event = {
            "matchId": match_id,
            "matchName": match_name,
            "endResult": end_result,
        }

        # print(match_event)

        # Send the match event to match-end-result-sinking-service
        url = "http://localhost:8080/api/v1/match-end-result"
        try:
            response = requests.post(url, json=match_event)
            if response.status_code == 202:
                print(f"Match sent: {match_event}")
            else:
                print("Failed!")
        except requests.exceptions.RequestException as e:
            print(f"Error occurred sending match event: {str(e)}")

        # Wait for one second before generating the next event
        time.sleep(1)

