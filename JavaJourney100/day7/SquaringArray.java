// given an integer array 'a' sorted in non- decreasing order, return an array of the sequence of each number sorted in non- decreasing order

/*Enter the size of the array
5
Enter the elements for the array : 
-5 -4 -3 2 2
4, 4, 9, 16, 25,  */

import java.util.Scanner;

public class SquaringArray {
    public static void main(String[] args) {
        int[] array = createArray();
        int[] answerArray = sortArray(array);
        displayArray(answerArray);
    }

    static int[] sortArray(int[] array) {
        int right = array.length - 1;
        int[] answer = new int[array.length];
        int left = 0;
        int answerPointer = 0;

        while (left <= right) {
            int leftSquare = array[left] * array[left];
            int rightSquare = array[right] * array[right];

            if (leftSquare >= rightSquare) {
                answer[answerPointer] = leftSquare;
                left++;
            } else {
                answer[answerPointer] = rightSquare;
                right--;
            }

            answerPointer++;
        }

        return reverseArray(answer);
    }

    static int[] reverseArray(int[] array) {
        int size = array.length;
        int[] revArray = new int[size];

        for (int i = 0, j = size - 1; i < size; i++, j--) {
            revArray[j] = array[i];
        }

        return revArray;
    }

    static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements for the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    static void displayArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + ", ");
        }
    }
}
