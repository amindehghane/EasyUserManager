Easy User Manager:
This project is a simple user management system implemented using the Spring Boot framework.
The goal of this project is to manage user information (first name, last name, and email) and store it in a database.
The system supports the basic CRUD operations: Create, Read, Update, and Delete.

Features:
Create User: Allows creating a new user by submitting first name, last name, and email.
Read User Information: Allows viewing user information by ID.
Update User Information: Allows updating user details.
Delete User: Allows deleting a user by ID.
Project Structure
Controller: Contains the API controller which handles HTTP requests.
DTO: Contains the Data Transfer Object (DTO) classes used to transfer data between different layers of the project.
Entity: Contains the user model that interacts with the database.
Repository: Contains the classes used to interact with the database.
Service: Contains the business logic that handles various operations.

Installation:
1. Make sure you have Spring Boot and the required tools installed.
2. Build the project using Maven or Gradle.
3. Configure your database settings in the application.properties or application.yml file.

properties:
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

4. Run the project using the following command:

bash:
mvn spring-boot:run

Using the API:
1. Create User
POST /users/apis/create

Request(json):
{
  "firstName": "Amin",
  "lastName": "Dehghan",
  "email": "aminnahiehdehghan96@gmail.com"
}

Response(json):
{
  "id": 1,
  "firstName": "Amin",
  "lastName": "Dehghan",
  "email": "aminnahiehdehghan96@gmail.com"
}

2. Get User by ID
GET /users/apis/{id}

Response(json):
{
  "id": 1,
  "firstName": "Amin",
  "lastName": "Dehghan",
  "email": "aminnahiehdehghan96@gmail.com"
}

3. Update User
PUT /users/apis/{id}

Request(json):
{
  "firstName": "Amin",
  "lastName": "Dehghan",
  "email": "aminnahiehdehghan96@gmail.com"
}

Response(json):
{
  "id": 1,
  "firstName": "Amin",
  "lastName": "Dehghan",
  "email": "aminnahiehdehghan96@gmail.com"
}

4. Delete User
DELETE /users/apis/{id}

Response(json):
{
  "message": "User deleted successfully"
}

Technologies Used
- Spring Boot: For building the application and managing dependencies.
- Spring Data JPA: For interacting with the database.
- MySQL: For data storage.
- Jackson: For converting data to JSON format.

Contributors
AminDehghan: Main developer
