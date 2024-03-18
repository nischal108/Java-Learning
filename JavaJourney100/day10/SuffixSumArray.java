
// similar to prefix sum array this code finds the suffix sum array of the entered array without using any new array

import java.util.Scanner;

public class SuffixSumArray {

    static int[] inputArray(Scanner sc) {
        System.out.print("Enter the size of the arryay : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements for the array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    static int[] suffixArray(int[] array) {
        for (int i = array.length - 2; i >= 0; i--) {
            array[i] = array[i] + array[i + 1];
        }
        return array;
    }

    static void displayArray(int[] array) {
        System.out.println("Final printed array : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        displayArray(suffixArray(array));
    }

}
