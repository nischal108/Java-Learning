import java.util.Scanner;
class Target{
    int counter =0;
    int targetSum(int[] arr, int sum){
        for(int i=0;i<arr.length; i++)
        {
        for(int j=i+1;j<arr.length; j++)
        {
        for(int k=j+1;k<arr.length; k++)
        {
            if(arr[i] + arr[j] + arr[k] == sum)
            counter++;
        }
        }
        }
        return counter;
    }
}
class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Target obj = new Target();
        int [] arr = new int [6];
        System.out.println("Enter 6 the numbers to form array");
        for(int i=0;i<6; i++)
        {
        arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target sum");
        int sum = sc.nextInt();
        System.out.println("There are " + obj.targetSum(arr,sum) + " triplets that output their sum as " +sum);
        sc.close();
    }
}