# Elencarlos Soares 

## Posterr Spring Boot Microservices API

# 🧠 About

Rest API built with Spring Framework using microservices architecture. 

## 🧪 Technologies

- Java
- Spring Boot
- Spring Cloud Gateway
- Discovery Server Eureka
- OpenFeign
- Ribbon
- Postgres
- Docker

## 🚀 How to run

#### Requeriments to compile and run containerized
- java jdk 17
- docker*
- docker compose*

If you want to recompile and build the artifacts:

```bash
# run docker-compose
$ ./mvnw clean install
```

After run last command or if you get the .zip pack just run:

```bash
# run docker-compose
$ docker-compose up --build
```

#### Run without docker in H2 database 

    $ cd eureka-discovery-service && ./mvnw spring-boot:run
    $ cd gateway-service && ./mvnw spring-boot:run
    $ cd post-service && ./mvnw spring-boot:run
    $ cd user-service && ./mvnw spring-boot:run

#### Import the postman collection
    Post.postman_collection.json

### 📚 Api Documentation

[http://localhost:8080/swagger-ui/#](http://localhost:8080/swagger-ui/#)

##### Eureka monitor 

[http://localhost:8761/](http://localhost:8761/)


### Connect to postgres database on
- localhost:5432 / postgres:postgres / posterr

# Critique

Because the test doesn't ask for authentication(that will be provided after), the user that create a post, repost or quote, need to be sendend in the post's boddy or query param, if not it is getted ramdomly in the user microsevice. 
To improve this, I would build an oauth2 microservice that will be used to authenticate the user, or chage the gateway to work as OAuth 2.0 Resource Server.

For the purpose of this test I used Eureka to register the microservices and Spring Cloud Gateway. But they can be replaced by kubernetes discovery and Ingress as gateway.

![](docs/springcloud.png)

![](docs/kubernetes.png)