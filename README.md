# Student Attendance System

## 📌 Setup & Run

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/VIJAYWHAT/Hackathon.git
cd Hackathon
```

### 2️⃣ Build the Project
```sh
mvn clean install
```

### 3️⃣ Run the Application
```sh
mvn spring-boot:run
```

### 4️⃣ Get JWT Token
```sh
curl -X POST "http://localhost:8080/auth/login" \
     -d "username=teacher&password=password" \
     -H "Content-Type: application/x-www-form-urlencoded"
```


🚀 **Now you're ready to develop further!**
