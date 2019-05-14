package exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
//        Write a Stream Expression to concatenate a Character list to a string!
        List<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');
        String result = characters.stream().map(c -> c.toString()).collect(Collectors.joining());
        System.out.println(result);

    }
}
