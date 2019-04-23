package thegardenaplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public List<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void watering(int water) {
        System.out.println("Watering with " + water);
        water = water/ plants.size();
        for (int i = 0; i < plants.size() ; i++) {
            plants.get(i).waterAmount = plants.get(i).waterAmount + water;
        }

    }


}
