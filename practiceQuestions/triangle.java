package practiceQuestions;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //reverse the above pattern
        
        System.out.println("opposite of the above pattern");

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(r+1-i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // this below can also be done as:
        //below piece of code also does same thing as the  above one
        for(int i=r;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
