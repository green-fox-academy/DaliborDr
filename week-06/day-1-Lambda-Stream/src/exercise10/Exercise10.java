package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
//        Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//        Write a Stream Expression to find the foxes with green color!
//                Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//                Write a Stream Expression to find the frequency of foxes by color!
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Bob","Red",10));
        foxes.add(new Fox("Stefany","Blue",7));
        foxes.add(new Fox("Kori","Orange",4));
        foxes.add(new Fox("Tom","Green",7));
        foxes.add(new Fox("Bruce","Green",1));

        List<Fox> greenFoxes =foxes.stream()
                .filter(s -> s.getColour() == "Green")
                .collect(Collectors.toList());
        System.out.println(greenFoxes);

        foxes.stream().filter(s -> s.getColour() == "Green" && s.getAge() < 5).forEach(System.out::println);

        Map<String,Long> countingFoxesByColour = foxes.stream().collect(Collectors.groupingBy(Fox::getColour,Collectors.counting()));
        System.out.println(countingFoxesByColour);

    }
}
