# Use lightweight Java runtime
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /spring-boot-docker-demp

# Copy jar file
COPY target/spring-boot-docker-demp-0.0.1-SNAPSHOT.jar spring-boot-docker-demp.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "spring-boot-docker-demp.jar"]