# Student Achievement Management System
This project is a **Student Achievement Management System** built using Java. The system allows managing student achievements, such as tracking their IDs, names, departments, and the achievements they have earned.

## Features
- **Add Student Details**: Store student ID, name, department, and marks.
- **Add Achievements**: Track multiple achievements for each student, including titles and descriptions.
- **Sort by Marks**: Sort students based on marks, with the topper displayed first.
- **File Input and Output**: Read data from an input file (`input1.txt`) and store processed information in an output file (`output.txt`).
- **Display Data**: View student and achievement information in a formatted output.

## Software Requirements

### 1. **Java JDK**
   - The project requires **Java JDK 8** or higher for compiling and running the Java code.
   - You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or use an open-source version like OpenJDK.

### 2. **Visual Studio Code (VS Code)**
   - The project was developed using **Visual Studio Code** (VS Code), a lightweight code editor with Java support.
   - You can download VS Code from [here](https://code.visualstudio.com/).
   - **VS Code Extensions Used**:
     - **Java Extension Pack**: A set of extensions for Java development.
     - **Maven for Java**: A build automation tool used for managing the project.

### 3. **Git**
   - **Git** was used for version control to track changes and manage project history.
   - You can download Git from [here](https://git-scm.com/).

### 4. **GitHub**
   - **GitHub** is used to host the project's repository, enabling easy collaboration and version management.
   - The project is available at [here](https://github.com/heynameisabhi/OOPJ-Assignment.git).

## Classes and Interfaces

### 1. **Main Class**
   This is the main class that reads student data from a file, sorts the students based on marks, displays their details, and writes them to a file.

   **Methods**:
   - `public static void main(String[] args)`: The main entry point of the program, which orchestrates the reading, sorting, displaying, and writing of student data.
   - `public static void readFromFile(String filename)`: Reads student and achievement data from an input file (`input1.txt`).
   - `public static void sortStudentsByMarks()`: Sorts the list of students based on their marks in descending order.
   - `public static void displayAllStudents()`: Displays the details of all students, with the topper displayed first.
   - `public static void writeToFile(String filename)`: Writes the student data to an output file (`output.txt`).

---

### 2. **Student Class**
   Represents a student and their associated achievements.

   **Attributes**:
   - `id` (int): The unique ID of the student.
   - `name` (String): The name of the student.
   - `department` (String): The department the student belongs to.
   - `marks` (int): The marks obtained by the student.
   - `achievements` (List<Achievement>): A list of achievements associated with the student.

   **Methods**:
   - `public void addAchievement(Achievement achievement)`: Adds an achievement to the student's achievement list.
   - `public void displayDetails()`: Displays the student's details, including their achievements.
   - `public String getDetails()`: Returns a formatted string representing the student's details for writing to a file.

---

### 3. **Achievement Class**
   Represents an achievement earned by a student.

   **Attributes**:
   - `title` (String): The title or name of the achievement.
   - `description` (String): A description of the achievement.

   **Methods**:
   - `public String getTitle()`: Returns the title of the achievement.
   - `public String getDescription()`: Returns the description of the achievement.
   - `public String getDetails()`: Returns a formatted string representing the achievement details.

---

### 4. **FileOperations Interface**
   This interface defines methods for reading and writing data to files.

   **Methods**:
   - `void readFromFile(String filename)`: Reads data from an input file.
   - `void writeToFile(String filename)`: Writes data to an output file.
