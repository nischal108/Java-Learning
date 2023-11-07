import java.util.Scanner;

public class problem_10 {

    public static void main(String[] args) {
        int[] arr = getInputArray();
        int k = getInputK();

        reverseLastKElements(arr, k);

        System.out.print("Reversed array: ");
        printArray(arr);
    }

    public static int[] getInputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int getInputK() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        return scanner.nextInt();
    }

    public static void reverseLastKElements(int[] arr, int k) {
        for (int i = 0; i < k / 2; i++) {
            int temp = arr[arr.length - k + i];
            arr[arr.length - k + i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
