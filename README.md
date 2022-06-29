# Posterr Spring Boot Microservices API 


### TLDR
If you are getting the .zip file just run:

```bash
# run docker-compose
$ docker-compose up --build
```

# 🧠 About

Rest API maded with Spring Framework using microservices architecture.

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

If you want to recompile and build the artifacts

```bash
# run docker-compose
$ ./mvnw clean install
```

After run last command or if you get the .zip pack just run:

```bash
# run docker-compose
$ docker-compose up --build
```

### Connect to postgres database on
- localhost:5432 / postgres:postgres / ms_user
- localhost:5433 / postgres:postgres / ms_worker
