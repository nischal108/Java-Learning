import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Matrix A
        System.out.println("Enter values for Matrix A (3x3):");
        int[][] matrixA = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for A[" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input for Matrix B
        System.out.println("Enter values for Matrix B (3x4):");
        int[][] matrixB = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter value for B[" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Displaying the result
        System.out.println("Resultant Matrix AXB (3x4):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
}
