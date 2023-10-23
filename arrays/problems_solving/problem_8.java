//swapping  two value method 1 ()

//give 2 integers a and b swap them 

import java.util.Scanner;

public class problem_8 {
    static void interchange(int[] arr1, int [] arr2){
        int [] arrtemp = new int [5];
            for( int i = 0; i<arr1.length ; i++){
                arrtemp[i]=arr1[i];
                arr1[i]=arr2[i];
                arr2[i]=arrtemp[i];
            }
        }
    public static void main(String[] args) {
        int [] arr1 = new int [5];
        int [] arr2 = new int [5];
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the values to form the array1");
         for(int i=0;i<5;i++){
            arr1[i]= sc.nextInt();
         }
         System.out.println("enter the values to form the array2");
         for(int i=0;i<5;i++){
            arr2[i]= sc.nextInt();
         }
        System.out.println("before swapping arr1 is");
         for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
         }
        System.out.println("before swapping arr2 is");
         for(int i=0;i<5;i++){
            System.out.println(arr2[i]);
         }
        interchange(arr1, arr2);
        System.out.println("after swapping arr1 is");
         for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
         }
        System.out.println("after swapping arr2 is");
         for(int i=0;i<5;i++){
            System.out.println(arr2[i]);
         }
        sc.close();
    }
    
}
