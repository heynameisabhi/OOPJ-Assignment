import java.util.ArrayList;
import java.util.List;
public class Student {
    private final int id;
    private final String name;
    private final String department;
    private final int marks; // New field for marks
    private final List<Achievement> achievements;

    public Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
        this.achievements = new ArrayList<>();
    }

    //For reading details from a file
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getMarks() { return marks; }
    public List<Achievement> getAchievements() { return achievements; }

    public void addAchievement(Achievement achievement) {
        achievements.add(achievement);
    }

    // Display details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
        System.out.println("Achievements:");
        for (Achievement ach : achievements) {
            System.out.println("  - " + ach.getTitle() + " - " + ach.getDescription());
        }
    }

    // For writing details to a file
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Student ID: ").append(id).append("\n");
        details.append("Name: ").append(name).append("\n");
        details.append("Department: ").append(department).append("\n");
        details.append("Marks: ").append(marks).append("\n");
        details.append("Achievements:\n");
        for (Achievement ach : achievements) {
            details.append("  - ").append(ach.getTitle()).append(" - ").append(ach.getDescription()).append("\n");
        }
        return details.toString();
    }
}
