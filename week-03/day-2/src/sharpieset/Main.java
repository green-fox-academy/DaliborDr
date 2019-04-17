package sharpieset;

public class Main {
    public static void main(String[] args) {

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.sharpieList.get(0).use();
        sharpieSet.sharpieList.get(0).use();
        sharpieSet.sharpieList.get(0).use();
        sharpieSet.sharpieList.get(0).use();
        sharpieSet.sharpieList.get(0).use();

        System.out.println(sharpieSet.sharpieList.get(0).inkAmount);
        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println(sharpieSet.sharpieList.size());
    }
}
