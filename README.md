
## Service registration discovery and spring cloud

### service-registration-and-discovery
- https://spring.io/guides/gs/service-registration-and-discovery

- A service registry is useful because it enables client-side load-balancing and decouples service providers from consumers without the need for DNS.

- service-registration-and-discovery allows to automatically discover only up instances, and 
it also registers new instances.
  
### spring-cloud-loadbalancer

- https://spring.io/guides/gs/spring-cloud-loadbalancer/

- it will delegate request to registered instances in a round-robin fashion.

### How to Test:

- Running Server:
  - Run from IDE
    <br /><br />
- Running Client:
  
- create a JAR using gradle terminal command:
  gradle eureka-client:bootJar
  <br /><br />
- Run client jar on different ports, so we can test round-robin:
  <br /><br />
- Command:
    <br />
    java -jar eureka-client-0.0.1-SNAPSHOT.jar --server.port=8081
    <br />
    java -jar eureka-client-0.0.1-SNAPSHOT.jar --server.port=8082
    <br />
    java -jar eureka-client-0.0.1-SNAPSHOT.jar --server.port=8083
  <br /><br />
- Send request on a server, which will delegate to one of the client:
  http://localhost:8761/hi
<br /><br />
- Run this in the browser to check registered servers:
  http://localhost:8761/

<br /><br />
