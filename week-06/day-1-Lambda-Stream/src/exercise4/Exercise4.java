package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise4 {
    public static void main(String[] args) {
//        Write a Stream Expression to get the average value of the odd numbers from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double a =numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.summingInt(n -> n));
        System.out.println(a);
        double average = a / numbers.stream().filter(n -> n % 2 !=0).collect(Collectors.toList()).size();
        System.out.println(average);
        //Better solution to solve this task...
        OptionalDouble result = numbers.stream()
                .filter(number -> !(number%2 ==0))
                .mapToInt(number -> number)
                .average();
        //we can also aply the method .getDouble at the og the code and then its not nessesary to use OptionalDouble, just Double
        System.out.println(result);

    }
}
