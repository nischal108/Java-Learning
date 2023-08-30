package problems_solving;
import java.util.Scanner;

//find the total numbers of pairs in the array whose sum i equal to the given value;

public class problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1 [] = new int [6];
        System.out.println("Enter 6 numbers to form the array = ");
        for (int i = 0; i < array1.length; i++) {
            array1 [i] = sc.nextInt();
        } 
        System.out.println("sum to be made by the elements = ");
        int sum = sc.nextInt();
        int counter = 0 ;

        //main operation
        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array1.length; j++) {
                if (i+j == sum) {
                    counter++;
                }
            }
        }
        System.out.println("There are " + counter + "digits combinations that give the output" +sum);

    }
    
}
