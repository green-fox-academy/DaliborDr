package exercise6;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
//        Write a Stream Expression to find the uppercase characters in a string!
        String string = "Lubos is Big";
        List<Character> characterList = new ArrayList<>();
        for (Character c: string.toCharArray()) {
            characterList.add(c);
        }
        characterList.stream().filter(s -> s.equals(Character.toUpperCase(s))).forEach(System.out::println);
    }
}
