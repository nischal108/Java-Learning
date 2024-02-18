
import java.util.Scanner;

// sort an array in such a way that first all the even numbers are displayed and then odd

public class evenOddsort {

    // following two pointers algorithm
    static void goodSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
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
