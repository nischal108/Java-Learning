import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = sc.nextInt();

        if (score >= 75) {
            System.out.println("Distinction");
        } else if (score >= 60) {
            System.out.println("First Division");
        } else if (score >= 45) {
            System.out.println("Second Division");
        } else if (score >= 33) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
