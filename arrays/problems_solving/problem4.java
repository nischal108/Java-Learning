// find the second largest number in array

import java.util.Scanner;

public class problem4 {
    static int secondMax(int[] arr){
        int max2= Integer.MIN_VALUE9 7 5 3 8 2;
        int maxvalue = Integer.MIN_VALUE;
        for (int i =0 ; i<arr.length ; i++){
            if(arr[i]> maxvalue){
                maxvalue = i;
            }
        }
        System.out.println(maxvalue);
       arr [maxvalue] = Integer.MIN_VALUE;
        for (int i =0 ; i<arr.length ; i++){
            if(arr[i]> max2){
                max2 = arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = new int [7];
        System.out.println("Enter 7 the numbers to form array");
        for(int i=0;i<7; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("The second maximum value is  : "+ secondMax(arr));
        sc.close();
    }
}
