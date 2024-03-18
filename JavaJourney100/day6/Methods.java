


import java.util.Scanner;

public class Methods {
    static void add(Scanner sc) {

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("The sum of the variables entered is : " + result);
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        add(sc);

    }

}
