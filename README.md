# Releve Bancaire
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=bugs)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=coverage)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=cdg.releve%3Areleveproject&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=cdg.releve%3Areleveproject)
# Overview
Building web project microservices for bank statement based on Hexagonal architecture & DDD using spring boot & maven

![](Visual%20Paradigm/ReleveBancaireVisualParadigm.png)




## Microservices Architecture

![](Visual%20Paradigm/relevebancaireprojectdiagramfinal.png)



## Organizing information (Urls & Ports)

| Microservices | Urls | Ports |
| :---         |     :---:      |          ---: |
| Releve Bancaire Microservice (Hexagonal Architecture)  | [Releve Bancaire Microservice (Hexagonal Architecture) Link](https://github.com/IbrahimBakhaled/Relevebancaire-microservice)    | https://relevebancaire:8081/api/v1    |
| Releve Bancaire Microservice (MongoDB)     | [Releve Bancaire Microservice (MongoDB) Link](https://github.com/IbrahimBakhaled/relevebancaire-microservice-mongodb)       | https://mongodb-microservice:8082/api/v2      |
| Activiti Workflow Microservice     | [Activiti Workflow Microservice Link](https://github.com/IbrahimBakhaled/Activiti-workflow-microservice)       | https://activiti-workflow:8083/api/v3      |
| Zipkin Distributed Tracing Server & RabbitMQ     | [Zipkin Distributed Tracing Server & RabbitMQ Link](https://github.com/IbrahimBakhaled/Zipkin-distributed-tracing-server-RabbitMQ)       | Zipkin: localhost:9411  RabbitMQ:15672      |
| Netflix Eureka Service Registry     | [Netflix Eureka Service Registry Link](https://github.com/IbrahimBakhaled/Netflix-Eureka-service-registry)       | https://netflix-eureka:8761      |
| Spring CLoud API Gateway     | [Spring CLoud API Gateway Link](https://github.com/IbrahimBakhaled/Spring-cloud-api-gateway)       | https://api-gateway:8765      |
| Angular - Frontend     | [Angular - Frontend Link](https://github.com/IbrahimBakhaled/angular-frontend-relevebancaire)       | https://localhost:4200      |


## Pre-requisite

- Apache Maven 3.8.4
- java version 8 update 144 ("1.8.0_144") 
- java version 11 update 13 for sonarscanner analyzing "11.0.13" 2021-10-19 LTS
- MySQL 8.0.28
- Spring Boot version 2.1.3.RELEASE


## How to build ?

`mvn clean install`


## How to start ?

`mvn spring-boot:run`

## Unit Testing with JUnit 5 & Mockito
Tested the save of releve bancaire with all ligne de releves and it all passed successfully ✔
![](resources/Rest%20Test%20passed.png)
<br />
<br />
<br />
![](resources/Releve%20Bancaire%20Controller%20Test.png)

## Run Sonar Scanner to SonarCloud
`mvn sonar:sonar -Dsonar.projectKey=cdg.releve:releveproject -DsonarZ.organization=ibrahimbakhaled -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=pass_token_here`

<br/>

## IMPORTANT ⚠
This branch is just for demonstration purpose only go for master branch for code.

## Author

- [Ibrahim BAKHALED](https://github.com/IbrahimBakhaled)

## Support
Find me on

<a href="https://www.linkedin.com/in/ibrahim-bakhaled-887429206/"><img align="left" src="resources/linkedin.png" alt="Ibrahim Bakhaled | LinkedIn" width="21px"/></a>
<a href="https://www.instagram.com/bakhaledibrahim/?hl=en"><img align="left" src="resources/instagram.png" alt="Ibrahim Bakhaled | LinkedIn" width="21px"/></a>
