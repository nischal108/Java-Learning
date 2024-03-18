
/*Check if we can partition the array into two subarrays with equal sum. More
formally, check that the prefix sum of a part of the array is equal to the suffix
sum of rest of the array. */


/* approach :
 * calculated prefix and suffix sum of the array and checked for the point where the suffix and prefix sum part is equal
 */




import java.util.Scanner;

public class ArrayPartition {

    static int[] inputArray(Scanner sc) {
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        if (size <= 0) {
            throw new IllegalArgumentException("Array size must be positive");
        }

        int[] arr = new int[size];
        System.out.println("Enter the elements for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void displayArray(int[] array) {
        System.out.println("The elements in the array are:");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    static boolean findPartition(int[] arr) {
        int totalSum = calculateSum(arr);

        // Check if total sum is even (required for equal partitions)
        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;

        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Check for partition where prefix sum equals half of total sum
            if (prefixSum == targetSum) {
                return true;
            }
        }

        return false;
    }

    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);

        if (findPartition(array)) {
            System.out.println("The array can be partitioned into two subarrays with equal sum.");
        } else {
            System.out.println("The array cannot be partitioned into two subarrays with equal sum.");
        }
    }
}
