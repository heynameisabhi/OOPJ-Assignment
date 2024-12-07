import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        readFromFile("input1.txt");
        displayAllStudents();
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
                Student student = new Student(id, name, department);
    
                
                for (int i = 3; i + 1 < data.length; i += 2) {
                    String title = data[i].trim();
                    String description = data[i + 1].trim();
                    Achievement achievement = new Achievement(title, description);
                    student.addAchievement(achievement);
    
                    System.out.println("Adding achievement: " + title + " - " + description);
                    
                }
                students.add(student);
                
                
            }
            System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace for better debugging
        }
    }
    
    

    // Display details of all students
    public static void displayAllStudents() {
        for (Student student : students) {
            student.displayDetails();
            System.out.println("----------------------");
        }
    }

    public void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) { // Read each line from the file
                System.out.println(line); // Process or display the line
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
            e.printStackTrace();
        }
    }
    

    // Write student data to a file
    public static void writeToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Student student : students) {
                writer.write("Student ID: " + student.getId() + "\n");
                writer.write("Name: " + student.getName() + "\n");
                writer.write("Department: " + student.getDepartment() + "\n");
                writer.write("Achievements:\n");
                for (Achievement ach : student.getAchievements()) {
                    writer.write("  - " + ach.getDetails() + "\n");
                }
                writer.write("----------------------\n");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace for detailed error output
        }
    }
    
}
