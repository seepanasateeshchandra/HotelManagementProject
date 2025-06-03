# HotelManagementProject

# 🏨 Hotel Management Project - Backend

This is a Spring Boot backend project for a **Hotel Management Project System**. It enables customers to register, search for available rooms, make bookings, post reviews, and allows admins to manage rooms and bookings. JWT-based authentication and role-based access control are implemented using Spring Security.

---

## 📌 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Security + JWT
- Spring Data JPA + Hibernate
- MySQL/PostgreSQL
- Maven
- Swagger UI for API Documentation
- Lombok
- ModelMapper

---

## ✅ Features

### 👥 User Module
- Register/Login (JWT-based authentication)
- View and update user profile
- Role-based access (`CUSTOMER`, `ADMIN`)

### 🏨 Room Module
- Admin can add/update/delete room info
- Customer can view available rooms
- Rooms linked with room types (Deluxe, Suite, etc.)

### 📅 Booking Module
- Customers can book rooms
- View bookings (filter by customer)
- Booking status (CONFIRMED, CANCELLED, COMPLETED)

### 💳 Payment Module
- Stores payment method, transaction ID, payment status
- Linked to specific booking

### ⭐ Review Module
- Customers can submit reviews for rooms they booked
- Star rating (1–5) + comments


---

## 🔐 Authentication & Authorization

- **JWT Token-based authentication**
- **Spring Security** with:
  - `/auth/register`, `/auth/login` (public)
  - `/admin/**` only for ADMIN
  - `/customer/**` only for CUSTOMER
- Role-based method protection using `@PreAuthorize`

---

## 📁 Project Structure

com.example.hotelmanagement
│
├── config # Security, JWT, ModelMapper, Swagger
├── controller # REST APIs for User, Room, Booking, etc.
├── dto # Request/Response DTOs
├── entity # JPA Entities
├── exception # Global Exception Handling
├── repository # Spring Data JPA Repositories
├── service # Business Logic Interfaces & Implementations
└── utils # Utility classes (e.g. JWT, validators)



---

## 🔗 Entity Relationships

- `User` ↔ `Booking` (OneToMany)
- `User` ↔ `Review` (OneToMany)
- `Room` ↔ `Booking` (OneToMany)
- `Room` ↔ `Review` (OneToMany)
- `Room` ↔ `RoomType` (ManyToOne)
- `Booking` ↔ `Payment` (OneToOne)

---

---

## ⚙️ How to Run

### 1. Clone the repo
```bash
git clone https://github.com/seepanasateeshchandra/hotel-management-system.git
cd hotel-management-system

****### Configure Application.properties****
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_management
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
#spring.jpa.hibernate.ddl-auto=create

Future Enhancements:

1.Email notification system (confirmation, cancellation)
2.Room image uploads
3.Advanced search/filter (by dates, price, amenities)
4.Integration with payment gateway
5.Admin dashboard (Spring Boot + React/Angular frontend)




