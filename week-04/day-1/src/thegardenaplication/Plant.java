package thegardenaplication;

public class Plant {
    public String name;
    public int waterAmount;

    public  Plant( String name) {
        this.name = name;
        this.waterAmount = 0;
    }

    public void watering(int water) {
        this.waterAmount += water;
    }


}
