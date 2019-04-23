package greenfoxinheritanceexcersice;

public class Student extends Person {
    private   String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.name = "Jane Doe";

    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old " + gender + " from " + previousOrganization
        + " who skipped " + skippedDays);
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
