import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("1. Print Hello");
            System.out.println("2. Print Goodbye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
 
            userChoice = scanner.nextInt();

       
            switch (userChoice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

        } while (userChoice != 3); 
        scanner.close(); 
    }
}
