FROM openjdk:17

EXPOSE 8080

ADD target/foodie-spring.jar foodie-spring.jar

ENTRYPOINT ["java", "-jar", "/foodie-spring.jar"]