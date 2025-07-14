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

## 📌 Roadmap

### 📦 Product Module
- ✅ `POST /api/products`
- ✅ `GET /api/products`
- ✅ `PUT /api/products/{id}`
- ✅ `DELETE /api/products/{id}`
- ✅ Role-based access (`ADMIN` only for create/update/delete)
- ✅ DTOs, validation, exception handling
- ✅ Swagger documentation
- ✅ Unit tests

### 🗂️ Category Module
- ✅ `POST /api/categories`
- ✅ `GET /api/categories`
- ✅ `PUT /api/categories/{id}`
- ✅ `DELETE /api/categories/{id}`
- ✅ Role-based access (`ADMIN` only for create/update/delete)
- ✅ Swagger documentation

### 🔐 Authentication Module
- ✅ JWT token generation (register/login)
- ✅ User roles (`ADMIN`, `CUSTOMER`)
- ✅ Spring Security with `@PreAuthorize`
- ✅ Swagger JWT integration

### 🚨 Error Handling
- ✅ Custom `ResourceNotFoundException`
- ✅ `GlobalExceptionHandler`
- ⚠️ 401/403 error docs pending polish

### 📄 Documentation
- ✅ Swagger UI with JWT
- ✅ Response examples and status codes
- ✅ Schema annotations with OpenAPI

### 🔜 Coming next
- 🟡 Order module (place/view/cancel orders)
- 🟡 Customer profile management
- 🟡 Payment simulation
- 🟡 Docker setup for local deployment
- 🟡 CI/CD with GitHub Actions
- 🟡 Role-based dashboard APIs


## 🧑‍💻 Author

Developed by ISC. Jose Ignacio Naranjo Guerra.  
Feel free to contribute or suggest improvements!

## 📄 License

This project is licensed under the MIT License.