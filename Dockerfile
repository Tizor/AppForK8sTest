FROM openjdk:14-alpine
COPY ./build/libs/AppForK8sTest.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "AppForK8sTest.jar"]
