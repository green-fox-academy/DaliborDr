import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
    System.out.println(divide(10,50));
    }
    public static int divide(int a,int b){
        if (a == b) {
            return a;
        }
        else if (a>b) {
            return divide(a - b, b);
        }
        else{
            return divide(a,b-a);
        }

    }
}
