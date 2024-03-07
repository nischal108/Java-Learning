package day12;

import java.util.Scanner;

public class MatrixMulti {
    static int[][] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column size of the matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Enter the " + row * col + " elements for the matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        sc.close();
        return array;
    }

    static void displayArray(int[][] array) {
        System.out.println("Output matrix is : ");
        for (int[] inside : array) {
            for (int element : inside) {
                System.out.print(element + " ");
            }
            System.out.print("\n");
        }
    }

    static boolean checkCombatibility(int[][] array1, int[][] array2) {
        return array1[0].length == array2.length;
    }

    static int[][] multiplyArray(int[][] array1, int[][] array2) {
        if (checkCombatibility(array1, array2)) {
            int row1 = array1.length;
            int col1 = array1[0].length;
            int col2 = array2[0].length;

            int[][] result = new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }

            return result;
        } else {
            System.out.println("Entered arrays are not compatible for multiplication");
            return null;
        }
    }

    public static void main(String[] args) {
        int[][] array1 = inputArray();
        int[][] array2 = inputArray();
        int[][] resultArray = multiplyArray(array1, array2);

        if (resultArray != null) {
            displayArray(resultArray);
        }
    }
}
