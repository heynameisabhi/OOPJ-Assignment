import java.io.*;
import java.util.*;

public class Main {
    private static final List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        readFromFile("input1.txt");
        sortStudentsByMarks();  // Sort students by marks
        displayAllStudents();   // Display topper and other students
        writeToFile("output.txt");
    }

    // Read student data from a file
    public static void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String department = data[2].trim();
                int marks = Integer.parseInt(data[data.length - 1].trim()); // Marks are the last field
                Student student = new Student(id, name, department, marks);

                for (int i = 3; i + 1 < data.length - 1; i += 2) { // Exclude the last field (marks)
                    String title = data[i].trim();
                    String description = data[i + 1].trim();
                    Achievement achievement = new Achievement(title, description);
                    student.addAchievement(achievement);
                }
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + filename);
        } catch (IOException e) {
            System.err.println("Error: Unable to read the file - " + filename);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid data format in the file.");
        }
    }

    // Sort students by marks in descending order
    public static void sortStudentsByMarks() {
        students.sort((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks())); // Descending order
    }

    // Display details of all students
    public static void displayAllStudents() {
        if (!students.isEmpty()) {
            System.out.println("Topper:");
            students.get(0).displayDetails(); // Topper
            System.out.println("----------------------");
            System.out.println("Other Students:");
        }
        for (int i = 1; i < students.size(); i++) { // Start from the second student
            students.get(i).displayDetails();
            System.out.println("----------------------");
        }
    }

    // Write student data to a file
    public static void writeToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            if (!students.isEmpty()) {
                writer.write("Topper:\n");
                writer.write(students.get(0).getDetails());
                writer.write("\n----------------------\n");
                writer.write("Other Students:\n");
            }
            for (int i = 1; i < students.size(); i++) {
                writer.write(students.get(i).getDetails());
                writer.write("\n----------------------\n");
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to write to the file - " + filename);
        }
    }
}
