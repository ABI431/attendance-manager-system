# Attendance Manager System

A cloud-based Attendance Management System built using Spring Boot, MySQL, and HTML/CSS/JavaScript.
This system allows administrators to manage students and teachers, teachers to mark attendance, and students to view their attendance records.

The project is deployed online and uses a cloud database, so it works without needing the developer’s PC to act as a server.

---

## 🚀 Live Application:
## https://attendance-manager-iv2y.onrender.com/index.html

- (Initial boot may take sometimes as it is working in free tier. And server will shutdown after inactivity of 15 minutes.)
---

🏗 System Architecture

User Browser
↓
Frontend (HTML, CSS, JavaScript)
↓
Spring Boot REST API (Hosted on Render)
↓
MySQL Cloud Database (Railway)

---

✨ Features

Admin

- Add students
- Add teachers
- Add subjects
- View and delete students
- View and delete teachers
- View and delete subjects

Teacher

- Select subject
- View student list
- Mark attendance (Present / Absent)

Student

- View attendance records

---

🛠 Tech Stack

Frontend

- HTML
- CSS
- JavaScript

Backend

- Spring Boot
- Spring REST API
- JWT Authentication

Database

- MySQL (Railway Cloud Database)

Deployment

- Render (Backend Hosting)
- Railway (Cloud Database)

Version Control

- Git
- GitHub

---

📁 Project Structure

attendance-manager-system

backend/attendance-system
→ Spring Boot backend

src/main/resources/static
→ Frontend HTML pages

README.md

---

📦 Installation (Local Setup)

Clone the repository

git clone https://github.com/ABI431/attendance-manager-system.git

Navigate to backend

cd backend/attendance-system

Run the Spring Boot application

mvn spring-boot:run

Open browser

http://localhost:8080/index.html

---

🗄 Database

The system uses a MySQL database hosted on Railway.

Tables include:

- users
- students
- teachers
- subjects
- attendance

---

📌 Future Improvements

- Attendance analytics dashboard
- Email notifications
- Mobile-friendly UI
- Export attendance reports (PDF / Excel)
---

### Live Demo

You can try the system using these demo accounts.

Admin Login
- Username: admin**
- Password: ********

Teacher Login
- Username: teacher03
- Password: teach123

Student Login
- Username: student03
- Password: stud123

Open the application:
https://attendance-manager-iv2y.onrender.com/index.html

---

👨‍💻 Author

## Abinand

GitHub
https://github.com/ABI431

---

📜 License

This project is created for educational purposes.
