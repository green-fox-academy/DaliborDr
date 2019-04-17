package farm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {

    ArrayList<Animal> animals = new ArrayList<>(30);


    public void breed() {
        while (30-animals.size()>0){
            animals.add(new Animal(40,40));
        }

    }

    public void slaughter() {
        int hunger =0;
        for (int i = 0; i <animals.size() ; i++) {
            for (animals.get(i))

        }


        }




    }
}
