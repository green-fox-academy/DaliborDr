package farm;

public class Main {
    public static void main(String[] args) {
        Farm happyCow = new Farm();
        happyCow.animals.add(new Animal(15,40));
        happyCow.animals.add(new Animal(45,35));
        happyCow.animals.add(new Animal(39,50));
        happyCow.animals.add(new Animal(26,10));
        System.out.println(happyCow.animals.size());
        happyCow.breed();
        System.out.println(happyCow.animals.size());
        happyCow.slaughter();



    }


}
