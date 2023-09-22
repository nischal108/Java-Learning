
// should return the first value that is getting repeated and if none element is repeated should return -1.

import java.util.Scanner;
public class problem_5 {
    static int repeatingValue(int[] arr){
    for(int i =0; i<arr.length ; i++)
    {
        for( int j = i+1; j<arr.length ; j++){
            if (arr[i] == arr[j]){
               return arr[i];
            }
        }
    }
    return -1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int [] arr = new int [7];
    System.out.println("Enter 7 numbers to form array");
    for(int i=0;i<7; i++)
    {
    arr[i]= sc.nextInt();
    }
    if(repeatingValue(arr)==-1){
        System.out.println("There are no elements getting repeated");
    }
    else
    System.out.println("The first element getting repeated is " + repeatingValue(arr) );
    sc.close();
            
    }
} 

