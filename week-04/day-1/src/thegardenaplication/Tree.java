package thegardenaplication;

public class Tree extends Plant {

    public Tree(String name) {
        super(name);
    }

    public void needWater() {
        if (waterAmount < 10) {
            System.out.println("The " + name + " Tree needs water");
        } else {
            System.out.println("The " + name + " Tree doesn't need water");
        }
    }
    @Override
    public void watering(int water) {
        waterAmount += water * 0.4;
    }



}
