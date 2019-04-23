package thegardenaplication;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        garden.plants.add(yellowFlower);
        garden.plants.add(blueFlower);
        garden.plants.add(purpleTree);
        garden.plants.add(orangeTree);

        garden.watering(40);
        garden.watering(70);





    }

}
