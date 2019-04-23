package thegardenaplication;

public class Flower {
    public String name;
    public int waterAmount = 0;

    public Flower(String name) {
        this.name = name;
    }

    public void needsWater() {
        if (waterAmount < 5) {
            System.out.println("The " + name + " Flower needs water");
        }
        else {
            System.out.println("The " + name + " doesn't need water");
        }
    }

    public void watering(int water) {
        waterAmount += water*0.75;

    }





}
