package cloneable;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John Doe",20, "male","random");
        Student johnTheClone = john.clone();
        System.out.println(johnTheClone.name);


    }
}
