package exercise10;

public class Fox {
    private String name;

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }

    private String colour;
    private int age;

    public Fox(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }


}
