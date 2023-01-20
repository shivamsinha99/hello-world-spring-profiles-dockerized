FROM openjdk:19
ADD target/hello-world-0.0.1-SNAPSHOT.jar hello-world-dev-staging-prod.jar
ENTRYPOINT ["java", "-jar", "hello-world-dev-staging-prod.jar"]