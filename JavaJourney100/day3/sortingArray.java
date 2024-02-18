//sort an array consisting of only 0s and 1s
// time optimized way

import java.util.Scanner;

public class sortingArray {

    // simple way to sort that is not efficient interms of time and space since 2
    // loops are being used
    static void sortArray(int[] arr) {
        int n = arr.length;
        int zeroes = 0;

        // counting the numbers of 0
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }

    // taking time and space complexity into consideration

    // using two pointers one from left and one from right

    // here two pointers runs one form left and the other from right the left
    // ensures it has 0s in the places it leaves behind
    // and the right one ensures it fills the roads it walks in with 1s.

    static void goodSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        inputArray(array, sc);
        goodSort(array);

        displayArray(array);

        sc.close();
    }

    // method to take aaray as input from the user

    static void inputArray(int[] array, Scanner sc) {
        System.out.println("Enter the arrays elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

    }
    // method to display array

    static void displayArray(int[] array) {
        System.out.println("The final arrays are :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

}