//reversing an array

import java.util.Scanner;
public class problem_9 {
    static void reversearray(int [] arrs){
        System.out.println("reveresed array");
        for(int i=4;i>=0;i--){
            System.out.println(arrs[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = new int [5];

        System.out.println("enter the values inside array");
        for(int i = 0 ; i<5 ; i++)
        {
            arr[i] = sc.nextInt();
        }
        reversearray(arr);
        sc.close();
    }
}
