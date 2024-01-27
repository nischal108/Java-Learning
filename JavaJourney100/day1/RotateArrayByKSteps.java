
// rotate array by k steps 
// k can also be larger than the size of array

import java.util.Scanner;

public class RotateArrayByKSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the size of the array from the user
        System.out.println("Enter the size of the array:");
        int sizeofArray = sc.nextInt();

        int[] array = new int[sizeofArray];

        // Taking the elements of the array
        for (int i = 0; i < sizeofArray; i++) {
            System.out.print("Enter " + (i + 1) + " term: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k, by how many positions do you want to rotate the array: ");
        int n = sc.nextInt();
        int k = n % sizeofArray;

        // Method to rotate the array
        rotateArray(array, k, sizeofArray);

        sc.close();
    }

    public static void rotateArray(int[] array, int k, int size) {
        int[] rev = new int[size];
        int j = 0;

        for (int i = size - k; i < size; i++) {
            rev[j++] = array[i];
        }

        for (int i = 0; i < size - k; i++) {
            rev[j++] = array[i];
        }

        displayArray(rev);
    }

    public static void displayArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
