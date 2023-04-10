FROM amazoncorretto:8-alpine-jdk
MAINTAINER GIULI
COPY target/portfoliofinal-0.0.1-SNAPSHOT.jar portfoliofinal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfoliofinal-0.0.1-SNAPSHOT.jar"]