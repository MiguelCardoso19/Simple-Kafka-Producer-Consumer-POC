FROM openjdk:21

COPY target/producer-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

EXPOSE 8085

CMD ["java", "-jar", "app.jar"]