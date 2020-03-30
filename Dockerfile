# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

EXPOSE 83

# The application's jar file
ARG JAR_FILE=target/security-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} security-service.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/security-service.jar"]