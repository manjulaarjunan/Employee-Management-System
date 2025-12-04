📘 Employee Management System

A simple Spring Boot + MySQL project that performs CRUD operations on employees.
This project demonstrates Controller → Service → Repository architecture, DTO usage (optional), validations, exception handling, and layered backend design.

📌 Features

✔ Add new employee
✔ Get employee by ID
✔ Get all employees
✔ Update employee (PATCH – partial update)
✔ Full update employee (PUT)
✔ Delete employee / delete all
✔ MySQL database integration
✔ Proper layered architecture (Controller → Service → Repository)

⚙️ Tech Stack

Layer	Technology

Backend	Java 17, Spring Boot
Database	MySQL
Tools	Maven, Postman
IDE	STS / IntelliJ / Eclipse

🗂️ Project Structure

src/main/java
 └── com.example.employeemanagementsystem
      ├── controller
      │     └── EmployeeController.java
      ├── service
      │     └── EmployeeService.java
      ├── repository
      │     └── EmployeeRepository.java
      ├── model
      │     └── employee.java

🛠️ API Endpoints

🔹 Add employee

POST /add

🔹 Get all employees

GET /getall

🔹 Get employee by ID

GET /getid/{id}

🔹 Update employee (PATCH – partial update)

PATCH /update/{id}
Updates only the fields provided in the request body.

🔹 Full Update (PUT – replace employee data)

PUT /fullupdate/{id}
Replaces all fields.

🔹 Delete employee

DELETE /delete/{id}

🔹 Delete all employees

DELETE /deleteall

🧪 Sample JSON (Add / Full Update)

{
  "employeename": "Ravi Kumar",
  "dob": "2002-05-20",
  "email": "ravi@gmail.com",
  "mobilenumber": "9876543210",
  "address": "Chennai",
  "doj": "2024-12-04",
  "designation": "Java Developer",
  "experience": 2,
  "skills": "Java, Spring Boot"
}

🧩 Partial Update (PATCH)

PATCH /update/5

{
  "email": "newmail@gmail.com",
  "mobilenumber": "9000000000"
}

Updates only 2 fields.

🗄️ MySQL Table

You must create a database:

CREATE DATABASE employeedb;

Then update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

🚀 How to Run

1. Clone the repo
2. Open with STS / IntelliJ / Eclipse
3. Configure MySQL details
4. Run the Spring Boot application
5. Test endpoints in Postman

📄 Output Examples

✔ Added employee
✔ Updated employee
✔ Fetched all employees
✔ Deleted employee
✔ Partial update working
🙌 Author

Manjula Arjunan
Java Developer • Spring Boot | MySQL | REST APIs
