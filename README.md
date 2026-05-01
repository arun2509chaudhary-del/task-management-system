# Task Management System 

A simple and efficient Task Management System built using **Spring Boot, MySQL, HTML, CSS, and JavaScript**.  
This project helps users create accounts, assign tasks, and manage task records easily.

---

## Features

✅ Create New User  
✅ Assign Task to User  
✅ View All Tasks of Specific User  
✅ REST API Integration  
✅ MySQL Database Connectivity  
✅ Simple Frontend UI  
✅ Clean Project Structure

---

## Tech Stack

### Backend:
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Frontend:
- HTML
- CSS
- JavaScript

### Database:
- MySQL

### Tools:
- Spring Tool Suite / Eclipse
- Maven
- Postman

---

## 📂 Project Structure

TaskManagementSystem
│── src/main/java/com/smart
│ ├── controller
│ │ ├── UserController.java
│ │ └── TaskController.java
│ ├── dao
│ │ ├── UserRepository.java
│ │ └── TaskRepository.java
│ ├── entities
│ │ ├── User.java
│ │ └── Task.java
│ └── SmartContactManagerApplication.java

│── src/main/resources
│ ├── static
│ │ ├── index.html
│ │ ├── style.css
│ │ └── script.js
│ └── application.properties

---

## ⚙️ API Endpoints

### User APIs

### Create User
POST /user/create

Sample JSON:

{
"name":"Arun",
"email":"arun@test.com"
}

---

### Task APIs

### Assign Task
POST /task/assign/{userId}

Sample JSON:

{
"title":"Complete Assignment",
"status":"PENDING"
}

---

### Get User Tasks
GET /task/user/{userId}

---

## ⚙️ Database Configuration

Update application.properties:

```properties
server.port=4041

spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=arun

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true