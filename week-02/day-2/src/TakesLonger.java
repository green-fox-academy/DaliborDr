import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;

public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

//        ArrayList<Element> arrayList = new ArrayList<Element>(Arrays.asList(array));
         String[] split = quote.split(" ");
//        for (String word:split) {
//            System.out.println(word);
//
//        }
        ArrayList<String> wordLists = new ArrayList<>(Arrays.asList(split));
        wordLists.add(3,"always");
        wordLists.add(4,"takes");
        wordLists.add(5,"longer");
        wordLists.add(6,"than");

        for (String word:wordLists){
            System.out.print(word+" ");
        }






    }
}