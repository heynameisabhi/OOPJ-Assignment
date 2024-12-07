public class Achievement {
    private final String title;
    private final String description;

    public Achievement(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // to get title
    public String getTitle() {
        return title;
    }

    // to get description
    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return "Achievement: " + title + " - " + description;
    }
}
