FROM openjdk:8
COPY ./target/Scientific-Calculator-with-Devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scientific-Calculator-with-Devops-1.0-SNAPSHOT.jar"]
