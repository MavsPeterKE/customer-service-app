# Use a Maven image for building the application
FROM maven:3.9.1-eclipse-temurin-17 AS build

# Set the working directory for the build
WORKDIR /app

# Copy the pom.xml and any other necessary Maven configuration files
COPY pom.xml ./

# Download Maven dependencies (layer caching)
RUN mvn dependency:go-offline

# Copy the source code into the image
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests


# Use a base image with OpenJDK
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy  Spring Boot application's JAR file into the container
COPY --from=build /app/target/rest-0.0.1-SNAPSHOT.jar /app/rest-app.jar


ENV PORT 8080
# Expose the port that your Spring Boot app will run on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "/app/rest-app.jar"]
