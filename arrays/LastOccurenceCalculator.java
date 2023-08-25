//To find the last occurence of an element in an array



import java.util.Scanner;
class LastOccurenceCalculator {
    static int occurence(int arr[],int digit){
        int placeHolder=0;
        for(int i= 0; i <arr.length; i++) {
            if (arr[i]==digit){
            placeHolder=i;
            }
        }
        return placeHolder;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size +"elements : ");
        for(int i =0; i<arr.length; i++){ 
            arr[i]= sc.nextInt();
        }
        System.out.println("Whose occurence do you want to check");
        int digit = sc.nextInt();
        System.out.println("The last occurence of "+digit+" is in "+occurence(arr,digit));

    }
}