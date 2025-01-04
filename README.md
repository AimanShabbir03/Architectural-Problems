# Netflix
Netflix, as one of the world's largest video streaming platforms, has faced significant architectural challenges throughout its evolution. These challenges arose as the company scaled its services to meet the demands of a global audience. Netflix's transformation from a monolithic architecture to a microservices-based, cloud-native platform revolutionized the streaming industry. By addressing scalability, failure tolerance, latency, data processing, and cost efficiency, Netflix created a highly resilient, scalable, and user-centric system. Their proactive approach to solving architectural challenges has made them a global leader in video streaming services, setting a benchmark for modern software architecture.
# Architectural-Problems
1. Monolithic Architecture Scalability Issues
2. Downtime Due to Single Points of Failure
3. Data Latency and Performance Issues
4. Complexity in Testing and Deployment
5. Personalization and Recommendation Limitations ,
   I briefly discussed these problems in my report and also provide the coding solutions for it.
# Problem which I pick
1. Monolithic Architecture Scalability Issues
Monolithic systems often struggle to handle increased traffic and require significant re-engineering to scale horizontally. We'll replicate a basic scenario of a monolithic service and refactor it into microservices.
# Benefits of Microservices
1. Scalability: UserService and StreamingService can scale independently.
2. Fault Isolation: A failure in one service does not affect the other.
3. Ease of Deployment: Changes can be made to one service without redeploying the entire system.
# Implementation of both Codes
when you are implementing my codes , implement monolithic service code in Ant project of netbeans it will easily implements and run, then implement microservices code in maven project by adding dependencies of spark. 
# Implementing a Monolithic to Microservices Transition in Maven
MonolithicService handles both user management and content streaming in a single codebase. The system is then refactored into two distinct services: UserService and StreamingService, which communicate via REST APIs.
# Steps 
1. MonolithicService:
A single Java class (MonolithicService.java) that manages both user and streaming logic within one codebase. The handleUserRequest and handleStreamingRequest methods represent user management and content streaming functionality, respectively.

2. Microservices Refactor:
UserService: A RESTful API running on port 8081 using Spark framework. It handles user-related requests by fetching details for a given user ID.
StreamingService: Another RESTful API running on port 8082, responsible for streaming content based on a content ID.
Client: A simple client (Client.java) that tests both services by making HTTP GET requests to UserService and StreamingService using HttpURLConnection and prints the responses.

3. Maven:
Maven is used to manage dependencies (e.g., Spark framework) and build the project. A pom.xml file is configured to handle Java version, dependencies, and Maven goals for the project.
