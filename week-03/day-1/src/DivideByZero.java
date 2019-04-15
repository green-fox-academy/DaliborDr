// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
public class DivideByZero {
    public static void main(String[]args){
        try {
            System.out.println(divide0(0));
        }
        catch (ArithmeticException e){
            System.out.println("fail");
        }

    }

    public static int divide0(int a){
        return 10/a;
    }
}