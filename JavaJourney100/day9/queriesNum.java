
// not an optimized solution since i have to traverse tha array everytime for the query.


/* Given an array of integers of size n. Answer q queries where you need to print the sum
of values in a given range of indices from I to r (both included).
Note: The values of 1 and r in queries follow 1-based indexing. */

 import java.util.Scanner;

class queriesNum{

    static int[] inputArray(Scanner sc ){
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int [] arr = new int[size+1];
        System.out.println("Enter the elements for the array : ");
        for(int i = 1 ; i<=size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    static int displaySum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }



    static void displayArray(int [] array){
        System.out.println("The elements int the array are :");
        for(int i :array){
            System.out.print(i + ", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = inputArray(sc);

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