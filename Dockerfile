FROM amazoncorretto:8-alpine-jdk
MAINTAINER GIULI
COPY target\portfoliofinal-2.7.7.jar portfoliofinal-2.7.7.jar
ENTRYPOINT ["java","-jar","/portfoliofinal-2.7.7.jar"]