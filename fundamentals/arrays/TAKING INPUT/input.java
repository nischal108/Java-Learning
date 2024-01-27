import java.util.Scanner;


public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numbers[]=new int[5];
        System.out.println("Enter th numbers : ");
        for(int i =0 ; i<5;i++)
        numbers[i]=sc.nextInt();
        for(int i =0 ; i<5;i++)
        System.out.println(numbers[i]);
    }
    
}
