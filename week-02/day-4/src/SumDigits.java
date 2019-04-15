public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1452));
    }

    public static int sumDigits(int a){
        if (a >0){


            return a%10 +sumDigits(a/10);
        }return a;
    }
}
