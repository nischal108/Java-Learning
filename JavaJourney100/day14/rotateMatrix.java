

// given a square matrix, turn it by 90 degrees in a clockwise direction without using extra space.


import java.util.Scanner;





public class rotateMatrix {


    static int[][] inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int col = sc.nextInt();
        int row = sc.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return array;
    }



    static void displayArray(int[][] matrix) {
        System.out.println("Result Array");
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    static int[][] rotateMatrices(int [] [] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int [] [] rotatedMatrix = new int [cols] [rows];
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static void main(String[] args) {
        int[][] originalMatrix = inputMatrix();

        System.out.println("Original Matrix:");
        displayArray(originalMatrix);

        System.out.println("\nRotated  Matrix after 90deg rotation:");
        displayArray(rotateMatrices(originalMatrix));
    }
}
