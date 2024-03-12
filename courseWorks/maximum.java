
// wap a program to find the maximum between 3 numbers

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + "is the maximum one");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the maximum");
        } else {
            System.out.println(num3 + " is the maximum");
        }
        sc.close();
    }
}