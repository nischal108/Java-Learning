import java.util.Scanner;

class pyramidNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print increasing sequence
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print decreasing sequence
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

        sc.close();
    }
}
