import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking operator input from user
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Taking two operands from user
        System.out.print("Enter first operand: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Enter second operand: ");
        double operand2 = scanner.nextDouble();
        scanner.close();

        double result;

        // Performing calculation based on operator
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
