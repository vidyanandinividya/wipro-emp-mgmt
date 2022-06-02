FROM openjdk:11
ADD target/WIPRO-Employee-Management-System-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar", "app.jar"]