# social-multiplication

Learn Microservices with Spring Boot + Vue	

### Docker 

- Rabbitmq

```sh
docker run -d --hostname code-couple --name rabbit-queue -p 15672:15672 -p 5672:5672 rabbitmq:3.6-management
```

```sh
## build docker images
mvn clean install

##should display three freshly built docker images
docker images

##start up all instances
docker-compose up
```

* Note in Docker for Windows settings check 'Expose daemon on tcp://localhost:2375 without TLS' to expose docker to WS

### UI 

- jQuery  

```sh
[/ui_jquery]$ java -jar [YOUR_JETTY_HOME_FOLDER]/start.jar
```
http://127.0.0.1:9090/ui/index.html
