public class NumberAdder {
    public static void main(String[] args) {
//
        System.out.println(addNum(5));
    }
    public static int addNum(int a) {
        if (a >= 1) {

            return addNum(a-1) +a;

        }
        return a;
    }
}
