FROM openjdk:19
EXPOSE 8080
ADD target/hello-world.jar hello-world-dev-stg-prod.jar
ENTRYPOINT ["java", "-jar", "hello-world-dev-stg-prod.jar"]