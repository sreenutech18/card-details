# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port  available to the world outside this container
EXPOSE 8080

COPY target/card-details-service-sb-1.0-SNAPSHOT.jar  card-details-service-sb-1.0-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/card-details-service-sb-1.0-SNAPSHOT.jar"]
