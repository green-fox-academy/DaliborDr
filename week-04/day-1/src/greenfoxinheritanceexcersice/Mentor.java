package greenfoxinheritanceexcersice;

public class Mentor extends Person {
    public  String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public  void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old " + gender + level + " mentor");
    }
}
