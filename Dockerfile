FROM openjdk:17.0.1-jdk-slim
VOLUME /tmp

EXPOSE 8080

HEALTHCHECK CMD curl --fail http://localhost:8080/info || exit 1   

COPY target/*.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.jar"]