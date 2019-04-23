package greenfoxinheritanceexcersice;

import java.util.List;

public class Cohort {
    public String name;
    public List<Student> students;
    public  List<Mentor> mentors;

    public void addStudent(Student student) {
        students.add(student);
    }

    public  void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + this.name + "cohort has " + students.size() + " students and " + mentors.size() + " mentors");
    }

}
