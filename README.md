# keycloaksecured-microservices-springboot

## Keycloak
`docker run -d -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin -p 8080:8080 --name keycloak jboss/keycloak`

Register realm and both clients in keycloak -> see `application.properties`
Redirect URL in keycloak client is `http://localhost:8080/*`
Create a role `user` and register a new user with that role.
Use this user for authentication with the service.

## Services
Service01 runs on 8080 and consumes Service02 which runs on 8181. Authentication of Service01 is used for authentication with Service02. Calling rest resource without a valid token results in a 401.
