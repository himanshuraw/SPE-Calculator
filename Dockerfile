FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/Calculator-1.0-SNAPSHOT.jar app.jar

#ENTRYPOINT ["java", "-jar", "app.jar"]
#
#CMD ["java", "-jar", "app.jar"]
CMD ["bash"]