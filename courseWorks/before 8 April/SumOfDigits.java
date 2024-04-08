import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input validation for an integer with at least five digits
        int num;
        do {
            System.out.print("Enter an integer with at least five digits: ");
            num = scanner.nextInt();
        } while (num < 10000); // Ensures the integer has at least five digits
        
        // Compute sum of digits
        int sum = calculateSumOfDigits(num);
        
        // Display result
        System.out.println("Sum of the digits of " + num + " is: " + sum);
        scanner.close();
    }
    
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
