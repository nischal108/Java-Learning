
// program to generate user required number of fibonacci series elements


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Fibonacci numbers do you want me to print: ");
        int num = sc.nextInt();
        int term1 = 0;
        int term2 = 1;
        System.out.print(term1 + "," + term2);

        while (num > 2) { // Updated condition to ensure correct number of iterations
            int temp = term1 + term2;
            System.out.print("," + temp);

            term1 = term2;
            term2 = temp;
            num--;
        }

        sc.close();
    }
}
