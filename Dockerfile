
FROM eclipse-temurin:25-jre

WORKDIR /app

COPY --chown=10001:10001 target/java-cicd-demo-1.0.0.jar app.jar

USER 10001:10001

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
