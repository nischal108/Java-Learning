import java.util.Scanner;
public class day7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // //wap to count the numbers of digits for a given number
        System.out.println("enter the number");
        int num = sc.nextInt();
        int counter = 0;
        for(;num>0;counter++){
            num=num/10;
        }
        System.out.println(counter);


        //wap to find the sum of digits in a given number n
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;

        //using for loop

        for(;num>0;){
            int term = num%10;
            sum += term;
            num = num/10;
        }

        // //using while loop
          while(num>0){
            int term = num%10;
            sum += term;
            num = num/10;
        }
        System.out.println(sum);

 // to reverse the given number
            int rev = 0;
             while(num>0){
                int term = num %10;
                rev= rev*10+term;
                num = num/10;
             }
             System.out.println(rev);

            
        sc.close();
    }
}