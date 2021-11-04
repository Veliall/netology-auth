FROM openjdk:17.0.1-oracle
VOLUME /tmp
EXPOSE 8080
ADD target/AuthService-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
