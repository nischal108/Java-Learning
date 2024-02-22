
// uaing two pointer approac

// given an array of integers 'a', move all the even integers at the begining of thre aray followed by all th odd integers. The relative order of odd or even integers does not matter. Return an array that satisfies the condition.

import java.util.Scanner;

public class EvenOddSort {

    public static void moveEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            while (left < right && arr[right] % 2 == 1) {
                right--;
            }

            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] getArrayInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] inputArray = getArrayInput();

        moveEvenOdd(inputArray);

        System.out.println("Array after moving even and odd elements:");
        printArray(inputArray);
    }
}
