import java.util.Scanner;


public class TransposeMatrix {


    static int[] [] inputMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int col = sc.nextInt();
        int row = sc.nextInt();
        int [] [] array = new int[row][col];
        System.out.println("Enter the elements of the matrix : ");
        for(int i =0; i<row;i++){
            for(int j =0; j<col;j++){
                array[i][j]= sc.nextInt();
            }
        }
        sc.close();
        return array;
    }

    static int[] [] transposeMatrix(int [] [] array){
        int[][] transposedMatrix = new int[array[0].length][array.length];
        for(int i=0;i<array.length;i++){
            for(int j =0; j<array[0].length;j++){
                transposedMatrix[j][i] = array[i][j];
            }
        }
        return transposedMatrix;
    }

    // in place transpose is only possible for a rectangular matrix with the logic used below.

    static void transposeInPlace(int [] [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array[0].length; j++) {
               swapElements(array,i,j);
            }
        }
    }
    static void swapElements(int[][] array, int i,int j){
        int temp = array [i][j];
        array[i][j]=array[j][i];
        array[j][i]=temp;
    }


    static void displayArray(int[] [] matrix){
        System.out.println("Result Array");
        for(int [] array:matrix){
            for(int element:array){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] originalMatrix = inputMatrix();

        System.out.println("Original Matrix:");
        displayArray(originalMatrix);

        transposeInPlace(originalMatrix);

        System.out.println("\nTransposed Matrix:");
        displayArray(originalMatrix);
    }
}
