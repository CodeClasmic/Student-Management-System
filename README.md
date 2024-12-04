### README for Student Management System

---

## **Student Management System**

A simple Java console application for managing student records. This project demonstrates object-oriented programming (OOP) concepts using classes such as `Student` and `Subject` for organizing data.

---

### **Features**
- **Add Students**: Enter student details (ID, name, age) and subject-wise marks.
- **Display Students**: View all student records along with their average marks.
- **Search Students**: Find a student by their ID.
- **Delete Students**: Remove a student record using their ID.
- **Calculate Average**: Automatically calculates the average of subject marks for each student.

---

### **Technologies Used**
- **Language**: Java
- **Concepts**: Object-Oriented Programming (OOP)

---

### **Classes Overview**
1. **`Subject`**:
   - Attributes: `name`, `mark`
   - Methods: Getters, setters, `displaySubject()`

2. **`Student`**:
   - Attributes: `id`, `name`, `age`, `subjects` (list of `Subject` objects)
   - Methods: Getters, setters, `calculateAverage()`, `displayStudent()`

3. **`StudentManager`**:
   - Manages the list of students.
   - Methods: `addStudent()`, `displayStudents()`, `searchStudentById()`, `deleteStudent()`

4. **`Main`**:
   - Provides a menu-driven interface for interacting with the system.

---

### **How to Run**
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Compile the Java files:
   ```bash
   javac Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

---

### **Usage**
Follow the on-screen menu to interact with the system:
1. Add a student and their subject marks.
2. View the list of all students.
3. Search for a specific student by ID.
4. Delete a student record by ID.
5. Exit the program.

---

### **License**
This project is licensed under the MIT License.

---

### **Contributing**
Feel free to fork this repository and submit pull requests. Suggestions and improvements are welcome!
