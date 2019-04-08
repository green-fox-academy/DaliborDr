import java.util.Arrays;
public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String[]args){


        int[][] myArray = new int[4][4];

        for (int row = 0; row <4 ; row++) {
            for (int column = 0; column <4 ; column++) {
                System.out.print(myArray[row][column]);

            }System.out.println();

        }





    }
}
