//  wap to generate pascals triangle 

/*
 * Enter the number of rows you want to generate : 5
1 
1 1 
1 2 1
1 3 3 1
1 4 6 4 1
 */
import java.util.Scanner;

public class pascalsTriangle{


    static int[][] generatePascalsTriangle(int rows) {
        int[][] array = new int[rows][];
        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        return array;
    }


    static void displayMatrices(int[][] matrix){
        for(int[] array :matrix){
            for(int element :array){
                System.out.print(element +" ");
            }
            System.out.println();
        }
    }

    





    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to generate : ");
        int rows = sc.nextInt();
        displayMatrices(generatePascalsTriangle(rows));

        sc.close();
    }
}