import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lichee");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Apple");
        listB.add("Avocado");
        listB.add("Blueberries");
        listB.add("Durian");
        listB.add("Lichee");

        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4, "Kiwifruit");
        if (listA.size() > listB.size()) {
            int i;
            i = listA.size() - listB.size();
            System.out.println("ListA is biger by " + i + " elements");
        } else if (listA.size() < listB.size()) {
            int j;
            j = listB.size() - listA.size();
            System.out.println("ListB is biger by " + j + " elements");
        } else {
            System.out.println("Lists are equal to each other");
        }
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        listB.addAll(new ArrayList<>(Arrays.asList()));
        System.out.println(listA.get(2));

        System.out.println(listA);
        System.out.println(listB);


    }
}
