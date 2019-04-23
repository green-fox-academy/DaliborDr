package thegardenaplication;

public class Flower extends Plant {

    public Flower(String name) {
        super(name);
        waterNeed = 5;
    }


    @Override
    public void watering(int water) {
        waterAmount += water*0.75;

    }
}
