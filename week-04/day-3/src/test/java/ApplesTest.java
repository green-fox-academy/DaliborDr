import org.junit.Test;
import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void apples_returnString_printApple() {
        Apples apples1 = new Apples("apple");

        assertEquals("apple", apples1.apples());



    }

}
