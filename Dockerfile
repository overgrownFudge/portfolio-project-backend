FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-portfolio-backend-docker.jar spring-boot-portfolio-backend-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-portfolio-backend-docker.jar"]