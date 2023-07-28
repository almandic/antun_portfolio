FROM python:3.11-alpine

ENV POETRY_VERSION 1.3.1

WORKDIR /app

COPY . /app

RUN apk update && apk add --no-cache \
        gcc \
        musl-dev \
        libpq-dev \
        libffi-dev \
        libxml2-dev \
        libxml2 \
        gettext \
        curl \
        wget

RUN pip install --no-cache-dir poetry==$POETRY_VERSION; \
    poetry install

EXPOSE 8000

CMD ["poetry", "run", "python", "manage.py", "runserver", "0.0.0.0:8000"]
CMD ["curl", "http://127.0.0.1:8000/api/v1/generate-matches/"]
