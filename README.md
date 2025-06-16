# Soatro

**Soatro** is a modern employee time-tracking system that enables secure clock-in/clock-out logging, shift management, and role-based access for admins and employees. Built with Spring Boot and PostgreSQL, it offers a RESTful backend designed for both web and mobile integration.
> _⏱️ Modern time tracking for growing teams. Secure. Scalable. Simple._

---

## ⚙️ Tech Stack

- Java 17  
- Spring Boot (Maven)  
- Spring Security (JWT-based)  
- Spring Data JPA  
- PostgreSQL  
- RESTful APIs  

---


## 📁 Project Structure
```
src/main/java/com/soatro/tracker/
├── controller/ # REST controllers (API endpoints)
├── dto/ # Data Transfer Objects for API input/output
├── entity/ # JPA entity classes (database models)
├── repository/ # Spring Data JPA repositories
├── service/ # Service layer interfaces
│ └── impl/ # Service layer implementations
├── config/ # Security and other configurations
├── enum/ # Enum types (e.g., roles, job titles, shift status)
└── SoatroApplication.java
```

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven installed
- PostgreSQL database (local or remote)

---

 ### ⚠️ Setup `.env` file (add to `.gitignore` — do **NOT** commit this)
```
DB_URL=jdbc:postgresql://localhost:5432/soatro
DB_USER=postgres
DB_PASS=your_db_password
JWT_SECRET=your_jwt_secret
```

> Use the `dotenv-java` library in your `SoatroApplication` to load environment variables.

---

### ▶️ Run the App

```bash
mvn spring-boot:run
```

### 🛠️ Planned Features

⏳ Secure user registration and login

⏳ Role-based access (Admin / Employee)

⏳ Clock in / clock out endpoint

⏳ Shift logs with timestamps

⏳ Admin dashboard (via REST API or frontend)


## 📦 Sample API Endpoints (Coming Soon):
```
POST /api/auth/register
POST /api/auth/login
POST /api/shifts/clock-in
POST /api/shifts/clock-out
GET  /api/shifts/employee/{id}
```

## 📄 License
MIT License

## 🙋 Contact

Built by **Shukurillo Ergashov**  
📧 Email: shukurillo.dev@gmail.com  

## 📤 Export Features
⏳ Export timesheets (PDF/CSV)

## 📱 Mobile-Ready
⏳ Mobile-ready backend API

