import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[]args0){

        HashMap<Integer,Character> map= new HashMap<>();
        System.out.println(map);

        map.put(97,'a');
        map.put(98,'b');
        map.put(99,'c');
        map.put(65,'A');
        map.put(66,'B');
        map.put(67,'C');

        for (int keys: map.keySet()){
            System.out.println(keys);
        }
        for (Character values:map.values()){
            System.out.println(values);
        }
        map.put(68,'D');
        for (int keys : map.keySet()){
            if (map()==map);
        }




    }

}
