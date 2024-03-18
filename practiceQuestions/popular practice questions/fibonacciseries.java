
//  java program to display fibonacci series  :0 1 1 2 3 5 8 .....
import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args){
        int firstTerm = 0, secondTerm =1, count,num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many terms do you want : ");
        count = sc.nextInt();
        System.out.println("fibonacci series : \n" +firstTerm+"\n"+secondTerm);
        for(i=2; i<count; i++)
        {
            num=firstTerm+secondTerm;
            System.out.println(num);
            firstTerm=secondTerm;
            secondTerm=num;
        }
        
    }
}
