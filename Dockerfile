FROM openjdk:17
COPY ./target /usr/src/app/target
RUN ls /usr/src/app/target
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/app/target/simple-webservice-0.0.1-SNAPSHOT.jar"]