FROM openjdk
EXPOSE 8081
COPY springbootproject/target/springbootproject-0.0.1-SNAPSHOT.jar springbootproject-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","springbootproject-0.0.1-SNAPSHOT.jar"]


