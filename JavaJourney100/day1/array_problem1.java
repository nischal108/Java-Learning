
// java is the top-level package that contains many of the core Java libraries.
//util is a subpackage under java that includes utility classes.
//Scanner is a class within the util package, and 
//it's used for taking input from various sources, such as the keyboard.




import java.util.Scanner;



// a public class is always required as this public class that matches the file name also works as an entry class for the compiler
// in a java file only a single class can be a public class since a public class is accessible from outside the file as well 
public class array_problem1 {



    // main function that will work as an entry point for the compiler since a class as an entry point is not enough. 

    //static keyword lets the method to be called without creating a object of the class the method is in 
    public static void main(String[] args) {

        // an variable named scanner is created which is of type Scanner and it has been assigned a object of Scanner class
        // here new Scanner(System.in) is a constructor since it is constructing an instance(object ) of Scanner class which takes input as system.in
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        // The new keyword is used to dynamically allocate memory for an array, and
        // int[size] specifies the type (integer array) and the size of the array.
        int[] array = new int[size];

        // Input elements into the array
        inputArrayElements(array, scanner);

        // Reverse the array
        reverseArray(array);

        // Display the reversed array
        displayArray("Reversed Array:", array);

        scanner.close();
    }

    // Method to input elements into the array
    private static void inputArrayElements(int[] arr, Scanner scanner) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    // Method to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the center of the array
            start++;
            end--;
        }
    }
    // Method to display the array
    private static void displayArray(String message, int[] arr) {
        System.out.println(message);

        //a for each loop 
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}