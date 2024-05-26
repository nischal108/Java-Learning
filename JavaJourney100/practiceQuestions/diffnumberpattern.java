import java.util.Scanner;

public class diffnumberpattern {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);


             //wap to print the following type pattern:
            //  1212121
            //  2121212
            //  1212121
            //  2121212
            //  1212121
            //  2121212

            
        System.out.println("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else
                System.out.print("2");
            }
            System.out.println();
        }   
        sc.close();
    }
}
