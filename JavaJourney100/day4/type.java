

import java.util.Scanner;

public class type{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the alphabet");
        char ch = sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("the alphabet you entered is a lowercase alphabet");
        }
        else if(ch>='A'&& ch<='Z'){
            System.out.println("the alphabet you entered is uppercase alphabet");
        }
        else{
            System.out.println("You entered some error alphabet ");
        }



        sc.close();
    }
}