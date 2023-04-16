FROM amazoncorretto:11-alpine-jdk 
MAINTAINER MAURIANDER
COPY target/portfoliofinal-0.0.1-SNAPSHOT.jar portfoliofinal-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/portfoliofinal-0.0.1-SNAPSHOT.jar"]
