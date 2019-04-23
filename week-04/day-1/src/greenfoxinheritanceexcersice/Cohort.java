package greenfoxinheritanceexcersice;

import java.util.*;


public class Cohort {
    public String name;
    public List<Student> students;
    public  List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

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
