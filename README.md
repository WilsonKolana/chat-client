# chat-client
  A chat client for apexcrm Backend engineer position dev test
  
# Problem statement:
Given the Swagger/OpenAPI spec here: 
https://chat-api.alpha.apexvisibility.co/swagger.json
  
Create a Grails or Spring Boot application which at startup, or via a controller does the following:
1. Logs in using the login endpoint
2. Lists / prints the accessible accounts
3. Finds the latest chat for an account
4. Adds the tag 'Dev Test' to the latest chat

# Solution

Separate endpoints were created for each step such that on execution, they consume the respective apex visibility chat API. Spring Boot(with Java) was used as the framework and Maven as the build tool.

# To run the project: 

run: mvn clean --install spring-boot:run

In order for the project to return expected results, the endpoints need to be called sequentially as follows:

1. The login endpoint (localhost:8080/login) - Get Request
2. Print accessible accounts (localhost:8080/accounts)  - Get Request
3. Find latest chat for an account (localhost:8080/chats/latest)  - Get Request
4. Adds the tag 'Dev test' to the latest chat (localhost:8080/chats/latest/{tag}) - Post
