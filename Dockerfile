FROM amazoncorretto:17
MAINTAINER GIULI
COPY target/portfoliofinal-2.7.7.jar portfoliofinal-2.7.7.jar
ENTRYPOINT ["java","-jar","/portfoliofinal-2.7.7.jar"]
