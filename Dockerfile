# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Copy the packaged JAR file into the container at /app
COPY target/*.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
