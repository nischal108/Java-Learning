package day8;

//Given an integer array 'a', return the prefix sum/running sum in the same array.

import java.util.Scanner;

public class PrefixSum {

    static void displayArray(int[] array) {
        System.out.print("The elements of the resulting array are : ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    static int[] inputArray() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements for the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    static int[] prefixArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = inputArray();

        displayArray(prefixArray(array));

    }
}
