FROM java:8
VOLUME /tmp
ARG JAR_FILE
COPY ./build/libs/docker-test-0.1.0.jar app.jar
CMD java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n,address=5005 -jar app.jar