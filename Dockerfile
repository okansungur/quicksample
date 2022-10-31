FROM openjdk:8-jdk-alpine
EXPOSE 4986
ARG JAR_FILE=/mydemo/target/mydemo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} mydemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mydemo-0.0.1-SNAPSHOT.jar"]