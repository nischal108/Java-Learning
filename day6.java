import java.util.Scanner;
public class day6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Emter the value for n");
        // int n = sc.nextInt();
        // What are Iterative Statements / Loops?
         //these are the statements that help us do the task repeatedly.
         //types of loop : while loop, fpr loop, do while loop

                     //while loop
         //while(condition){
            //code
         //}

         // sum of n natural numbers
        //  int i = 0;
        //  int sum = 0;
        //  while(i<=n){
        //     sum = sum + i;
        //     i++;
        //  }
        //     System.out.println(sum);   
        
        
                    //forloop
        // //sum of natural numbers
        // int sum = 0;
        // for(int i = 1; i <= n;i++){   // here all three statements are optional, initialization, condition and  final expression but we have to use ;
        //      sum = sum +i;
        // }
        //  System.out.println(sum);

                        //do while loop 
                // first work and after that check condition , first iteration will work 
                // suru ko iteration sadhai hunxa ra checking second iteration dekhi hunxa 

                // do{
                //     System.out.println(n);
                //     n--;
                // }
                // while(n>=1);

                // print the sum of stream of integers in the input
                //lets assume ki use le -1 diyo bhane he wants to stop program
            


                    //break 
                    //stops the loop
                     //chalirakhne loop ko bich ma break lagauxa

                     //program to find the first common LCM of 5 and 7, n must be entered 1 since it starts checking from 1
                    //  // we want only one lcm so we used break after sout once it is sout it goes to break and loop terminates
                    //  while(true){
                    //     if(( n % 5==0) && ( n %7 ==0)){
                    //         System.out.println(n);
                    //         break;
                    //     }
                    //     n++;
                    //  }


                                //continue
                        //stops the current itration but continues from the next iteration

                        // wap to print numbers from 1 to 50 except the multiples of 3

                        // for(int num = 1; num<=50; num++){
                        //     if(num%3==0){
                        //         continue;
                        //     }
                        //     System.out.println(num);
                        // }


                                    //labels

                                    //loop ko agadi myloop: esari loop lai name dine 
                                    //continue haru garda aba kaha jane bhanera  continue myloop; bhandine
                                
                                
                    
         sc.close();
    }
}