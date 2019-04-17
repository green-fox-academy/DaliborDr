package sharpieset;


import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpieList= sharpieList();



    public List<Sharpie> sharpieList() {


        ArrayList<Sharpie> sharpies = new ArrayList<>();
        sharpies.add(new Sharpie("blue", 20));
        sharpies.add(new Sharpie("green", 15));
        return sharpies;

    }
    public void removeTrash(){
        for (Sharpie sharpie : sharpieList){
            if (sharpie.inkAmount==0){
                sharpieList.remove(sharpie);
            }

        }
    }
    public int countUsable(){
        int numberOfUsable = 0;
        for (Sharpie sharpie : sharpieList){
            if (sharpie.inkAmount !=0){
                numberOfUsable++;
            }
        }return numberOfUsable;
    }

}