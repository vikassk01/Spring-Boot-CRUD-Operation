# 🚀 Spring Boot User CRUD API

A backend REST API built using Spring Boot to perform CRUD (Create, Read, Update, Delete) operations on user data.
This project was initially developed as a basic CRUD application and later enhanced with exception handling and validation to make it production-ready.

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven

## 📌 Project Evolution

### 🔹 Phase 1: Basic CRUD

In the initial version, the project included:

* RESTful API endpoints (GET, POST, PUT, DELETE)
* Layered architecture (Controller, Service, Repository)
* MySQL database integration using JPA
* Basic data operations (create, read, update, delete)
* API testing using Postman
* 
### 🔹 Phase 2: Enhanced (Advanced Features)

The project was later improved with real-world backend practices:

* Global exception handling using `@ControllerAdvice`
* Custom exception (`UserNotFoundException`)
* Structured error responses (message, status, timestamp)
* Input validation using `@Valid`, `@NotBlank`, `@Email`
* Handling validation errors using `MethodArgumentNotValidException`

## 📂 Project Structure

com.example.demo
│
├── controller      # Handles HTTP requests
├── service         # Business logic
├── repository      # Database operations
├── model           # Entity classes
└── exception       # Exception & validation handling

## 🔥 API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| POST   | /users      | Create user    |
| GET    | /users      | Get all users  |
| GET    | /users/{id} | Get user by ID |
| PUT    | /users/{id} | Update user    |
| DELETE | /users/{id} | Delete user    |

## ⚠️ Exception Handling (Enhanced)

Returns meaningful error responses instead of generic server errors.

### Example:
{
  "message": "User not found with id: 1",
  "status": 404,
  "timestamp": "2026-04-09T10:30:00"
}

## ✅ Validation (Enhanced)

Prevents invalid data from entering the system.

### Example Input:
{
  "name": "",
  "email": "abc"
}

### Response:
{
  "name": "Name cannot be empty",
  "email": "Invalid email format"
}
## 💡 What I Learned

* Building REST APIs using Spring Boot
* Designing layered architecture
* Database interaction using JPA & Hibernate
* Dependency Injection and IOC concepts
* Implementing global exception handling
* Validating user input and handling errors

## 🔗 How to Run

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the Spring Boot application
4. Test APIs using Postman

## 📌 Author

**Vikas**
Aspiring Java Developer 🚀
