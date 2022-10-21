# Spring Cloud Kubernetes Samples

Spring Cloud Kubernetes Samples

<img src="https://github.com/susimsek/spring-cloud-kubernetes-samples/blob/main/images/introduction.png" alt="Spring Cloud Kubernetes Samples" width="100%" height="100%"/> 

# Spring Cloud Kubernetes

Spring Cloud Kubernetes provides implementations of well known Spring Cloud interfaces allowing developers to build and run Spring Cloud applications on Kubernetes. While this project may be useful to you when building a cloud native application, it is also not a requirement in order to deploy a Spring Boot app on Kubernetes

## Features

Kubernetes awareness

DiscoveryClient implementation

PropertySource objects configured via ConfigMaps

Client side loadbalancing via Netflix Ribbon

# Development

Before you can build this project, you must install and configure the following dependencies on your machine.

* Java 17
* Kotlin
* Maven 3.x
* Mongodb


## Build

You can install the dependencies and build by typing the following command

```sh
mvn clean install
```

## Testing

You can run application's tests by typing the following command

```
mvn verify
```


## Code Quality

You can test code quality locally via sonarqube by typing the following command

```sh
mvn -Psonar compile initialize sonar:sonar
```

## Detekt

Detekt a static code analysis tool for the Kotlin programming language

You can run detekt by typing the following command

```sh
mvn antrun:run@detekt
```

## Docker

You can also fully dockerize  the sample applications. To achieve this, first build a docker image of your app.
The docker image of sample app can be built as follows:


```sh
mvn -Pjib verify jib:dockerBuild
```

## Rsocket

RSocket is a new messaging protocol that’s designed to solve some common microservice communication challenges. With RSocket you get a flexible protocol that works over TCP or WebSockets. This means you can do binary messages without conversion. You get modern controls like multiplexing, back-pressure, resumption, and routing, and you get multiple messaging modes including fire-and-forget, request-response, and streaming. RSocket is fully reactive too, so it’s ideal for your high-throughput microservice applications

### Rsocket Example Request With Rsc

```sh
rsc --stream --route=graphql --dataMimeType="application/graphql+json" --data='{"query":"subscription { postAdded { id, title, content } }" }' --debug tcp://localhost:8079 --authBearer ${TOKEN} 
```

```sh
rsc --request --route=graphql --dataMimeType="application/graphql+json" --data='{"query":"{ post(id: \"632c8028feb9e053546a88f2\") { id, title } }" }' --debug tcp://localhost:8079  --authBearer ${TOKEN} 
```

## Deployment with Docker Compose

### Prerequisites for Docker Compose Deployment

* Docker
* Docker Compose

You can deploy app by running the following bash command


```sh
 sudo chmod +x deploy.sh
```

```sh
 ./deploy.sh -d
```

You can uninstall app the following bash command

```sh
 ./deploy.sh -d -r
```

The GraphQL App be accessed from the link below.  
http://127.0.0.1:9091


## Deployment Kubernetes with Helm

### Prerequisites for Kubernetes Deployment

* Kubernetes
* Helm

You can deploy app by running the following bash command

```sh
 sudo chmod +x deploy.sh
```

```sh
 ./deploy.sh -k
```

You can uninstall app the following bash command

```sh
 ./deploy.sh -k -r
```

You can upgrade the App (if you have made any changes to the generated manifests) by running the
following bash command

```sh
 ./deploy.sh -u
```

# Used Technologies
## Backend Side
* Java 17
* Kotlin
* Docker
* Docker Compose
* Kubernetes
* Helm
* Sonarqube
* Detekt
* Mongodb
* Rsocket
* Spring Boot
* Spring Cloud
* Spring Cloud Kubernetes
* Spring Boot Web Flux
* Spring Boot Graphql
* Spring Boot Security
* Spring Boot OAuth2 Resource Server
* Spring Security Rsocket
* Spring Security Messaging
* Spring Boot Validation
* Spring Boot Actuator
* Spring Boot Configuration Processor
* Kotlinx Coroutines Reactor
* Querydsl
* Mapstruct

## Backend Side for TDD
* Spring Boot Test
* Spring Security Test
* Spring Graphql Test
* Kotlin Test Junit
* Mockito Kotlin
* Reactor Test
* Kotlinx Coroutines Test