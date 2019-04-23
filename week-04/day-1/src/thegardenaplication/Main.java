package thegardenaplication;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower yellowFlower = new Flower("yellow Flower");
        Flower blueFlower = new Flower("blue Flower");
        Tree purpleTree = new Tree("purple Tree");
        Tree orangeTree = new Tree("orange Tree");

        garden.plants.add(yellowFlower);
        garden.plants.add(blueFlower);
        garden.plants.add(purpleTree);
        garden.plants.add(orangeTree);

        garden.watering(40);
        garden.watering(70);
        System.out.println(garden.plants.get(1).isNeedsWater());





    }

}
