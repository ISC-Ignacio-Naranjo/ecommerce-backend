# E-commerce Backend API

This project is a backend API for an e-commerce platform built using **Spring Boot** and structured with a **feature-based package organization**. The project follows **Clean Code** and **Clean Architecture** principles to ensure maintainability, scalability, and testability.

## 🧱 Architecture

- **Framework**: Spring Boot
- **Language**: Java 21
- **Structure**: Feature-based (e.g., `com.ecommerce.product.controller`)
- **Patterns**: DTOs, Services, Repositories, Exception Handling

Each feature module includes:
```text
com.ecommerce.[feature]
 ├── controller
 ├── dto
 ├── model
 ├── repository
 └── service
```

## 🚀 Features

- Product management (CRUD)
- Category handling
- User management (to be implemented)
- Order processing (to be implemented)
- Authentication & authorization (to be implemented)
- Exception handling with `@ControllerAdvice`

## 📦 Technologies Used

- **Spring Boot**
- **Spring Data JPA**
- **Lombok**
- **PostgreSQL** / **H2** (for local testing)
- **Swagger/OpenAPI**
- **JUnit 5 + Mockito**

## 🔧 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/ecommerce-backend.git
   cd ecommerce-backend
   ```

2. Configure the database in `application.yml` or `application.properties`.

3. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Access the API documentation at:

   ```
   http://localhost:8080/swagger-ui.html
   ```

## 🧪 Testing

- Unit tests for services and controllers using JUnit + Mockito.
- To run tests:

  ```bash
  ./mvnw test
  ```

## 📁 Example Endpoint

```http
GET /api/products
```

Returns the list of available products.

## 🚀 Roadmap

### ✅ Completed

- **Product & Category Module**
    - ✅ Create (`POST`)
    - ✅ Retrieve all (`GET`)
    - 🔜 Update (`PUT`)
    - 🔜 Delete (`DELETE`)

- **Authentication**
    - ✅ JWT-based login & register
    - ✅ Role-based authorization (`@PreAuthorize`)

- **User Roles**
    - ✅ Admin & Customer roles
    - ✅ Access restrictions by role

- **Swagger Integration**
    - ✅ Swagger UI available
    - ✅ Bearer token support for authorized endpoints

- **Error Handling**
    - ✅ Global exception handler
    - ✅ Standardized API error response format

- **Testing**
    - ✅ Unit tests for Product & Category services

- **Environment Configuration**
    - ✅ `application.yml` & `application-sample.yml` for safe config
    - ✅ `.gitignore` to exclude secrets and logs

- **Repository Setup**
    - ✅ Pushed to GitHub with clean commit history (no secrets)

---

### 🔜 Upcoming

- ⏳ `PUT` and `DELETE` endpoints for Product & Category
- ⏳ Order module (CRUD + relationships)
- ⏳ Payment gateway integration (Stripe or similar)
- ⏳ Docker containerization
- ⏳ CI/CD pipeline setup with GitHub Actions
- ⏳ Deployment to cloud provider (e.g., Render, Railway, Fly.io)


## 🧑‍💻 Author

Developed by ISC. Jose Ignacio Naranjo Guerra.  
Feel free to contribute or suggest improvements!

## 📄 License 
This project is licensed under the MIT License. 
