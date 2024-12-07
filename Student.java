import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final String department;
    private final List<Achievement> achievements;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.achievements = new ArrayList<>();
    }

    // To get ID
    public int getId() {
        return id;
    }

    // To get name
    public String getName() {
        return name;
    }

    // To get department
    public String getDepartment() {
        return department;
    }

    // To get achievements
    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void addAchievement(Achievement achievement) {
        achievements.add(achievement);
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Achievements:");
        for (int i = 0; i < achievements.size(); i++) {
            Achievement ach = achievements.get(i);
            System.out.println("  - Achievement " + (i + 1) + ": " + ach.getTitle() + " - " + ach.getDescription());
        }
    }
    
    
}
