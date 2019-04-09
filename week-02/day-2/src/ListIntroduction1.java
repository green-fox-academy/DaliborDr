import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args){

        ArrayList<String> myList= new ArrayList<>();
        myList.add(0,"Wiiliam");
        myList.add("John");
        myList.add("Amanda");
        System.out.println(myList.size());

        System.out.println(myList);
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));
        }
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println((i+1)+ "." + myList.get(i));

        }
        myList.remove(1);
        System.out.println(myList);

        myList.clear();
        System.out.println(myList);





    }
}
