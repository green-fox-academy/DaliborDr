package thegardenaplication;

public class Flower extends Plant {

    public Flower(String name) {
        super(name);
    }

    public void needsWater() {
        if (waterAmount < 5) {
            System.out.println("The " + name + " Flower needs water");
        }
        else {
            System.out.println("The " + name + " doesn't need water");
        }
    }
    
    @Override
    public void watering(int water) {
        waterAmount += water*0.75;

    }





}
