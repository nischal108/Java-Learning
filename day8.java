import java.util.Scanner;
public class day8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input number");
        int num = sc.nextInt();

        // program to calculate the factorial of an input number
        int mul = 1;
        while(num>0){
            mul = mul * num;
            num--;
        }
        System.out.println(mul);


        //




        sc.close();
    }
}