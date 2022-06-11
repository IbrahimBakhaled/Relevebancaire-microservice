# Docker file for the Read Service
#
# Version 0.0.1

#jdk image
FROM adoptopenjdk/openjdk11:alpine-jre
USER root
# install

# label for the image
LABEL Description="Releve Bancaire Hexagonal Architecture"

VOLUME /tmp

COPY relevebancaire-docker-keystore.crt $JAVA_HOME/lib/security
RUN \
    cd $JAVA_HOME/lib/security \
    && keytool -importcert -alias relevebancaire-docker -storepass changeit -trustcacerts -noprompt -keystore cacerts -file relevebancaire-docker-keystore.crt
#    && keytool -keystore cacerts -storepass changeit -noprompt -trustcacerts -importcert -alias ldapcert -file ldap.cer
# Add the service as app.jar
ADD . .
ADD application/adapter-rest/target/relevebancaire.jar app.jar

# touch the archive for timestamp
RUN sh -c 'touch /app.jar'

# entrypoint to the image on run
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


























#
#
#FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
#COPY pom.xml /tmp/
#COPY application /tmp/application/
#COPY bootloader /tmp/bootloader/
#COPY domain /tmp/domain/
#COPY infrastructure /tmp/infrastructure/
#COPY infrastructure/adapter-persistence-spring-data-jpa /tmp/infrastructure/adapter-persistence-spring-data-jpa/
#COPY infrastructure/adapter-persistence-spring-data-mongodb /tmp/infrastructure/adapter-persistence-spring-data-mongodb/
#COPY infrastructure/adapter-rest/ /tmp/infrastructure/adapter-rest/
#WORKDIR /tmp/
#RUN mvn clean install -Pdocker
#
#FROM openjdk:8-jdk-alpine
#COPY --from=MAVEN_TOOL_CHAIN /tmp/bootloader/target/bootloader-1.0-SNAPSHOT.jar app.jar
#
#RUN sh -operationCredit 'touch /app.jar'
#
#ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://host.docker.internal:27017/Releve-Bancaire-CDG", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

