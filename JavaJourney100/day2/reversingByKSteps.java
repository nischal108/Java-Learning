package day2;




import java.util.Scanner;

public class reversingByKSteps{


    //method to take input from the user
    static void inputArray(int[]array, Scanner sc){
        int length = array.length;

        for(int i =0;i<length ;i++){
            System.out.print("Enter " +(i+1)+" element : ");
            array[i]=sc.nextInt();
        }
    }


    //method to swap 
    static void swap(int[] arr, int i,int  j){
        int temp =arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
  

    // method to reverse an array

    static void reverseArray(int[]array,int i,int j){
        while (i<j){
            swap(array,i,j);
            i++;
            j--;
        }
    }



    //method to display array 

    static void displayArray(int[] arr){
        int length = arr.length;
        for(int i =0;i<length ;i++){
            System.out.print( arr[i] + " " );
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array  : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        //calling the method to ask for input
        inputArray(array,sc);
        System.out.println("Enter the value of k : ");

        int kReal = sc.nextInt();

        int k= kReal % size;


        reverseArray(array, 0, size - 1); // Reverse the entire array
        reverseArray(array, 0, k - 1); // Reverse the first k elements
        reverseArray(array, k, size - 1); // Reverse the remaining elements


        System.out.println("Finally array after reversing it by " + kReal + " steps");
        displayArray(array);
    }
}