package day2;

/*  searching for a number in an array and displaying whether a number is present 
 * and if present how many times is it present content of the array is between 0 and 1000000
 * the program must be time efficient
 * 
 * 
 *      Logic used :
 * as soon as the user inputs and array the array is traversed and a frequency array is made  of the max size defined 
 * the freq array stores the freq of repetition of the content of array so when the ask we don't have to traverse the array.
*/


import java.util.Scanner;

public class checkingIftheNumberisPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        arrayInput(array, sc);

        int[] freqarray = frequencyarray(array);

        System.out.print("Enter how many queries do you have");
        int queries = sc.nextInt();

        while (queries > 0) {
            System.out.print("Enter the number to search for : ");
            int num = sc.nextInt();
            if (freqarray[num] > 0) {
                System.out.println("Yes number is present ");
            } else {
                System.out.println("no number is not present ");
            }
            queries--;
        }

        sc.close();
    }

    static void arrayInput(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + " item : ");
            array[i] = sc.nextInt();
        }
    }

    static int[] frequencyarray(int[] array) {
        int[] freq = new int[100000];
        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }

        return freq;
    }

}
