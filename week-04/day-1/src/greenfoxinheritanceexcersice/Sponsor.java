package greenfoxinheritanceexcersice;

public class Sponsor extends Person {
    public String company;
    public  int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name,age,gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old " + gender + " who represents " + company +
                "and hired " + hiredStudents);
    }

    public void hire() {
        this.hiredStudents += 1;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

}
