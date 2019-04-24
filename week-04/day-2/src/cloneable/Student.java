package cloneable;


public class Student extends Person implements Cloneable {
    private   String previousOrganization;
    private int skippedDays;

    public Student clone() {
        return new Student(this.name,this.age,this.gender,this.previousOrganization);
    }


    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";

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
