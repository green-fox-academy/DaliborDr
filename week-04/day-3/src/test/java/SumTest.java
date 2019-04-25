import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SumTest {

    List<Integer> newNumbers;

    @Before
    public void beforeTest() {
        newNumbers = new ArrayList<>();
    }

    @After
    public  void afterTest() {
        newNumbers = null;

    }
    @Test
    public void getSum_countingIntegersInList_returnFive() {
        newNumbers.add(1);
        newNumbers.add(3);
        newNumbers.add(1);
        Sum mySum = new Sum(newNumbers);
        Integer a = 5;
        assertEquals(a,mySum.getSum());
    }

    @Test
    public void getSum_countingWithEmptyList_expectingNull() {
        Sum mySum = new Sum(newNumbers);

        Integer a = 0;

        assertEquals(a,mySum.getSum());

    }

    @Test
    public void getSum_counting_nullToReceive() {
        Integer a = 5;
        newNumbers.add(a);
        Sum mySum = new Sum(newNumbers);
        assertEquals(a,mySum.getSum());
    }
}
