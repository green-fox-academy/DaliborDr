public class DrawChessTable {
    public static void main(String[] args){
        String object = "%";
        String empty = " ";

        for (int i = 1; i <= 8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                int c = i+j;
                if (c % 2== 0){
                    System.out.print(object);
                }
                else {
                    System.out.print(empty);
                }

            }
            System.out.println();

        }






    }
}
