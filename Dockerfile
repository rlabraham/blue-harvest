FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8080
WORKDIR /app
COPY app/target/app-1.0.0-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "app-1.0.0-SNAPSHOT.jar" ]