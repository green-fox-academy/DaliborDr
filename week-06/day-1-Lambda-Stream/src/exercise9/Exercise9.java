package exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
//        Write a Stream Expression to find the frequency of characters in a given string!
        String myString = "Lubos has shitty superpowers";
        List<Character> characters = new ArrayList<>();
        for (Character character : myString.toCharArray()) {
            characters.add(character);
        }
        System.out.println(characters);
        Map<Character,Long> map =characters.stream().collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        System.out.println(map);


    }
}
