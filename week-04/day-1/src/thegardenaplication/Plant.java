package thegardenaplication;

public class Plant {
    public String name;
    protected double waterAmount;
    public double waterNeed;
    boolean needsWater;



    public  Plant( String name) {
        this.name = name;
        this.waterAmount = 0;
    }

    public void watering(int water) {
        this.waterAmount += water;
    }

    public boolean isNeedsWater() {
        if (waterAmount < waterNeed) {
            needsWater = true;
        }
        else {
            needsWater = false;
        }
        return needsWater;
    }
}
