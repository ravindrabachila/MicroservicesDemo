FROM openjdk:8-jdk-alpine
MAINTAINER Ravindra Reddy "ravindrabachila@gmail.com"
VOLUME /tmp
ADD */target/*App*.jar app1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app1.jar"]