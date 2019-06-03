FROM java:8
VOLUME /tmp
ADD spring-boot-docker-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch spring-boot-docker-0.0.1-SNAPSHOT.jar'
EXPOSE 8088
ENTRYPOINT ["java","-jar","app.jar"]