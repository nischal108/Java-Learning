
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // printing spaces
            for (int j = i; j < rows - 1; j++) {
                System.out.print(" ");
            }
            // Printing stars on the left side
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Printing stars on the right side
            for (int l = i - 1; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();

        }

        sc.close();
    }
}
