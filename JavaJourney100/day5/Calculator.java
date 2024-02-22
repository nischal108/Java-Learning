import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char userChoice; // Declare userChoice outside the do-while loop to use it later
        do {
            System.out.println("What do you want to do? (+, -, *, /) \n 'e' to exit ");
            userChoice = sc.next().charAt(0); // Use charAt(0) to get the first character

            // Check if user wants to exit
            if (userChoice == 'e') {
                break;
            }

            System.out.print("Enter the two operands: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            // Perform calculations based on user input
            switch (userChoice) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    // Check for division by zero
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }

        } while (userChoice != 'e');
        sc.close();
    }
}
