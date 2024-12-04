public class Subject {
    private String name;
    private int mark;

    // Constructor
    public Subject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        } else {
            throw new IllegalArgumentException("Mark must be between 0 and 100.");
        }
    }

    // Display subject details
    public void displaySubject() {
        System.out.println(name + ": " + mark);
    }
}
