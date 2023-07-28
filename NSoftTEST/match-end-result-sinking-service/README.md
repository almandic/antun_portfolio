Hello. This is a Spring boot aplication for synchronizing data from a generator to Postgres database.

To run this project, first run the following commands to install the dependencies:

```bash
mvn clean install
```

Then, run the following command to run the server:

```bash
mvn spring-boot:run
```

The application will be available at http://localhost:8080

POST request to sync with database can be sent to http://localhost:8080/api/v1/match-end-result/

To see which home team scored most goal see http://localhost:8080/api/home-team-with-most-goals/
