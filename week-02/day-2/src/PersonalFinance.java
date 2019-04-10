//We are going to represent our expenses in a list containing integers.
//
//        Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which solves the following problems.
//        How much did we spend?
//        Which was our greatest expense?
//        Which was our cheapest spending?
//        What was the average amount of our spendings?
import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {

        ArrayList<Integer> fin = new ArrayList<>();
        fin.add(500);
        fin.add(1000);
        fin.add(1250);
        fin.add(175);
        fin.add(800);
        fin.add(120);
        int sum =0;
        for (int i = 0; i <fin.size() ; i++) {
            sum += fin.get(i);
        }
        System.out.println(sum);
        int max = fin.get(0);
        for (int i = 0; i <fin.size() ; i++) {
            if (max> fin.get(i)){
                max=fin.get(i);
            }
            else{
                System.out.println(max);
            }

        }

    }

}
