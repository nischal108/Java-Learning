// taking input and displaying the contents of multi dimensional array


import  java.util.Scanner;

public class ForEachInMultiArray {



    static int[][] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column size of the matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [] [] array = new int[row][col];
        System.out.println("Enter the "+ row*col +" elements for the matrix :");
        for(int i = 0; i<row;i++){
            for(int j = 0; j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }

        sc.close();
        return array;
    }



    static void displayArray(int[][] array){
        System.out.println("Output matrix is : ");
        for (int[] inside : array) {
            for(int element :inside){
                System.out.print(element+ " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        displayArray(inputArray());
    }
}
