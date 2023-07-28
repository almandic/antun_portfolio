from django.db import models
import uuid


class Match(models.Model):
    matchId = models.UUIDField(default=uuid.uuid4, editable=False, unique=True)
    matchName = models.CharField(max_length=100)
    endResult = models.CharField(max_length=10)

    def __str__(self):
        return f"{self.matchName} - {self.endResult}"
