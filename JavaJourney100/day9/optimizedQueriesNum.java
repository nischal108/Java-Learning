/* Given an array of integers of size n. Answer q queries where you need to print the sum
of values in a given range of indices from I to r (both included).
Note: The values of 1 and r in queries follow 1-based indexing. */

// / taken time complexity into consideration
// no traversion on array allowed for every queries
// prefix sum array was created

import java.util.Scanner;

class optimizedQueriesNum {

    static int[] inputArray(Scanner sc) {
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter the elements for the array : ");
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int displaySum(int[] array, int start, int end) {

        return (array[end]-array[start-1]);
    }

    static int[] prefixSumArray(int[] array){
        for(int i=1;i<array.length;i++){
            array[i]+=array[i-1];
        }
        return array;
    }

    static void displayArray(int[] array) {
        System.out.println("The elements int the array are :");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        array = prefixSumArray(array);

        System.out.println("Enter the number of queries:");
        int numQueries = sc.nextInt();

        for (int q = 1; q <= numQueries; q++) {
            System.out.println("Enter the starting and ending range to calculate sum for query " + q + ":");
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println("The sum for query " + q + " is " + displaySum(array, start, end));
        }
        sc.close();
    }
}