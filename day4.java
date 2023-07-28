import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // DAY 4
            //precedence of operators
            //there is a table that shows the precedence of operator
            //bitwise operators th operators that operate on bit level 
            // ( or | , and &, exor ^ ,bitwise not ~ ,  left shift <<  , right shift >> )   9 or 10----> 10001 or 1010 , bitwise operator calculates for every digit


        //java conditionals (control statements)


         // WAP to tell if the user input number is even or odd.

         System.out.println("Enter the number you want to check : ");
         int a = sc.nextInt();
         if(a % 2 == 0){
            System.out.println("This is an even number");
         }
         else{
            System.out.println("The number is odd");
         }

         
         sc.close();

    }
}
