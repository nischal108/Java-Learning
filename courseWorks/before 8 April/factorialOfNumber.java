// wap to find the factorial of a number 

import java.util.Scanner;

public class factorialOfNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to calculate factorial for  : ");
        int num = sc.nextInt();
        int factorial=1;
        while(num>1){
            factorial*=num;
            num--;
        }
        System.out.println("THe factorial of the entered  number is "+ factorial);

        sc.close();
    }

}