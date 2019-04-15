public class Bunnies {
    public static void main(String[] args) {
        System.out.println(ears(10));
    }

    public static int ears(int a) {
        if (a > 0) {
            return ears(a - 1) + 2;
        }
        return a;
    }
}