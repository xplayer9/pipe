FROM openjdk:11
ADD target/pipeApi.jar pipeApi.jar
ENTRYPOINT ["java", "-jar","pipeApi.jar"]
EXPOSE 8080