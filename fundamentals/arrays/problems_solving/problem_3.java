
// find the unique number in a given array where all the elements are being repeated twice with one value being unique.



import java.util.Scanner;


public class problem_3 {
   static int targetSum(int[] arr){
    for(int i =0; i<arr.length ; i++)
    {
        for( int j = i+1; j<arr.length ; j++){
            if (arr[i] == arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
    }
    int a =-1;
    for(int i=0; i<arr.length ; i++){
        if(arr[i] >0){
        a = arr[i];
        }
    }
    return a;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int [] arr = new int [7];
    System.out.println("Enter 7 the numbers to form array");
    for(int i=0;i<7; i++)
    {
    arr[i]= sc.nextInt();
    }
    System.out.println("The number that is unique and is only repeated once is " + targetSum(arr));
    sc.close();
            
    }
} 
