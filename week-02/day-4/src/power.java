public class power {
    public static void main(String[] args) {
        System.out.println(calc(5,2));
    }
    public static int calc(int a,int b){
        if (a > 1 && b > 1){
            return calc(a,b-1)*a;
        }
        return a;

    }
}
