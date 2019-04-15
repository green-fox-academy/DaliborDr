public class BunniesAgain {
    public static void main(String[] args) {
    System.out.println(bunnies(4));
    }
    public static int bunnies(int a){
        if (a>0 && a%2==0){
            return bunnies(a-1)+3;
        }
        else if (a>0){
            return bunnies(a-1)+2;
        }return a;
    }
}
