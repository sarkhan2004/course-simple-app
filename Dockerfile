FROM eclipse-temurin:21-jre

COPY build/libs/course-application-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java"]

CMD ["-jar", "app.jar"]

