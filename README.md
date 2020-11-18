# (BooksApplication) by Hemza LARIBI

***
BOOKS MANAGEMENT TOOL - Swagger/Spring Boot/MySQL RESTful Application
***

Developpement :
- Swagger-3 used for API classes generation with JAXRS like language and not Spring (see : POM.xml & booksapplication/src/main/resources/Books-spec.yaml) to avoid the generation of "ResponseEntity"
- The controller's implements the API classes
- The services do all the work
- Converter's classes make the API Model classes and the Entities working together
- The workflow of coding is :  API REST Generation --> RestController --> Service+Converter --> JpaRepository

DB configuration :
This application need to create a MongoDB with the characteristics found on : booksapplication/src/main/resources/application.properties

Tools :
- Java8
- Spring Boot
- JAX-rs
- JPA/Hibernate
- Maven 
- MySQL
- Springfox-swagger2
- Workbench

BUILD :
    mvn clean install

RUN :
    mvn spring-boot:run
    
    You can access the service from the browser : http://localhost:8080/swagger-ui.html
        
    
# BooksApplication

