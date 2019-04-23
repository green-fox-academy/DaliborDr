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
        water= water/ needWater();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).isNeedsWater()) {
                plants.get(i).watering(water);
                System.out.println("The " + plants.get(i).name + " needs water");
            }
            else {
                System.out.println("The " + plants.get(i).name + " doesn't need water");
            }
        }


    }

    public int needWater() {
        int amountFlowers = 0;
        for (int i = 0; i < plants.size() ; i++) {
            if (plants.get(i).isNeedsWater()) {
                amountFlowers++;
            }
        }
        return amountFlowers;
    }



}
