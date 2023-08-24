// program to how many times is a digit being repeated in an array
import java.util.Scanner;
public class HelloWorld {
    static void searchDigit(int[] arr, int digit){
        int counter=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==digit)
            counter+=1;
        }
    System.out.println("The digit was repeated"+ counter + "times");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[4];
        System.out.println("enter the digits to make an array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("which number do you want to check for ?");
        int digit = sc.nextInt();
        searchDigit(arr, digit); // Call the method to search for the digit
    }
}