FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD xlfd-eureka-1.0.0.RELEASE.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8100