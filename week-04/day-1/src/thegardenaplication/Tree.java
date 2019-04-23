package thegardenaplication;

public class Tree {
    public int waterAmount = 0;
    public String name;

    public Tree(String name) {
        this.name = name;
    }

    public void needWater() {
        if (waterAmount < 10)
        System.out.println("The " + name + " Tree needs water");
    }

    public void watering(int water) {
        waterAmount += water * 0.4;
    }



}
