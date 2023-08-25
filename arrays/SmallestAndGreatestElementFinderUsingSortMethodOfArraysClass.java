import java.util.Arrays;
import java.util.Scanner;


public class SmallestAndGreatestElementFinderUsingSortMethodOfArraysClass{
    int smallest = 0;
    int largest = 0;
    static int[] smallestlargest(int[] arr){
       Arrays.sort(arr);
       int [] ans = {arr[0], arr[arr.length-1]};
       return ans;
    }
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter " + size +"elements : ");
    for(int i =0; i<arr.length; i++){ 
        arr[i]= sc.nextInt();
        }
    int [] ans = smallestlargest(arr);
    System.out.println("Smallest element is " + ans[0]);
    System.out.println("Greatest element is " +ans[1]);
    
    }
}