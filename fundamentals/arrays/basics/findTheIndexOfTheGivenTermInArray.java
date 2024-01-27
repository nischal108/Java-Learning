import java.util.Scanner;

class ArraySearch { 
    public void searchAndDisplayIndex(int[] array, int userNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNumber) {
                System.out.println("Index of the element: " + i);
                return; // Exit the loop once the element is found
            }
        }
        System.out.println("Element not found in the array.");
    }
    }
    public class findTheIndexOfTheGivenTermInArray{
        public static void main(String[] args) {
        int hello[] = {1, 2, 5, 4, 3, 6, 6, 745, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to look for: ");
        int userNumber = sc.nextInt();
        ArraySearch obj = new ArraySearch();
        obj.searchAndDisplayIndex(hello, userNumber);
        sc.close();
    }
}
