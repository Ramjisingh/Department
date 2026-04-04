FROM eclipse-temurin:21-jre-jammy

WORKDIR /app
COPY target/*.jar department.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "department.jar"]