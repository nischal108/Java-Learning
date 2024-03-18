import java.util.Scanner;

public class MatrixOps {

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];

        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows1 = a.length, cols1 = a[0].length, cols2 = b[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols2; j++)
                for (int k = 0; k < cols1; k++)
                    result[i][j] += a[i][k] * b[k][j];

        return result;
    }

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
        inputMatrix(scanner, matrixB);

        // Addition
        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Sum of matrices:");
        printMatrix(sum);

        // Subtraction
        int[][] difference = subtractMatrices(matrixA, matrixB);
        System.out.println("Difference of matrices:");
        printMatrix(difference);

        // Multiplication
        int[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("Product of matrices:");
        printMatrix(product);

        scanner.close();
    }

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
