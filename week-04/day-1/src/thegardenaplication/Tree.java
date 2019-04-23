package thegardenaplication;

public class Tree extends Plant {

    public Tree(String name) {
        super(name);
        waterNeed = 10;

    }

    @Override
    public void watering(int water) {
        waterAmount += water * 0.4;
    }



}
