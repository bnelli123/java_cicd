# Java CI/CD Demo

A simple Java 25 calculator using Maven and JUnit 5, with GitHub Actions CI.

## Requirements
- JDK 25
- Maven 3.9+

## Build and test
```bash
mvn clean verify
java -jar target/java-cicd-demo-1.0.0.jar
```

Push to `main` or open a pull request against `main` to trigger GitHub Actions CI.
