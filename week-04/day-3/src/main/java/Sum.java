import java.util.List;

public class Sum {
    private List<Integer> numbers;

    public Sum(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer getSum() {
        Integer sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
