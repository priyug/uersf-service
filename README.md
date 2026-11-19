This project uses Spring Cloud OpenFeign to enable communication between the UserF Service and PostF Service.
OpenFeign is a declarative REST client that simplifies HTTP communication between microservices.
Instead of writing REST API calls manually using RestTemplate, we can define an interface with Feign annotations.

Architecture
UserF Service: Acts as the Feign client and requests post details.
PostF Service: Provides post-related information through REST APIs.
OpenFeign Client: Establishes communication between the two services.

Key Features
Declarative REST API communication.
Simplifies inter-service communication.
Reduces boilerplate HTTP client code.
Uses @FeignClient to define the target microservice.
Uses @GetMapping and @PathVariable to pass unique IDs.
Supports loosely coupled microservice architecture.

Technologies Used
Java
Spring Boot
Spring Cloud OpenFeign
Spring Web
Microservices Architecture
