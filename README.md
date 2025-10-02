# Inventory Management System API

## Project Description
This is a Spring Boot-based **Inventory Management System** that allows managing **Suppliers**, **Products**, and **Orders**.  
The API supports CRUD operations, product dispatch, and order tracking. It demonstrates backend development skills using Java, Spring Boot, and MySQL.  

---

## Features
- Add and view suppliers
- Add and view products
- Place orders
- Dispatch products (updates stock automatically)
- Stock quantity validation to prevent negative inventory

---

## Technologies Used
- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- MySQL
- Lombok
- Postman for testing APIs

---

## Setup & Run Locally

## 1. Clone the repository
```bash
git clone https://github.com/Gayatritumram/Inventory-Sys.git
```
## 2. Navigate to project folder
bash
cd inventory-sys

## 3. Update database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db

spring.datasource.username=YOUR_DB_USERNAME

spring.datasource.password=YOUR_DB_PASSWORD

spring.jpa.hibernate.ddl-auto=update

## 4. Run the project
bash
mvn spring-boot:run

## 5. Test API endpoints using Postman:
## SUPPLIERS:

POST /suppliers → Add supplier

GET /suppliers → Get all suppliers

## PRODUCTS:

POST /products → Add product

GET /products → Get all products

POST /products/dispatch/{id}?quantity=5 → Dispatch product

## ORDERS:

POST /api/orders → Place order

GET /api/orders → Get all orders
