

import java.util.Scanner;

public class Reverse2Darray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Matrix A
        System.out.println("Enter the dimensions of Matrix A (rows columns):");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter elements of Matrix A:");
        inputMatrix(scanner, matrixA);

        // Input for Matrix B
        System.out.println("Enter the dimensions of Matrix B (rows columns):");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter elements of Matrix B:");
        inputMatrix(scanner, matrixB);}

    private static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = scanner.nextInt();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }
        System.out.println();
    }
    
}
