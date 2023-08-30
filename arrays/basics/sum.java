
// WAP to calculate the sum of all the elements in the given array.
 class array{
    int arr [] = { 1,5,3};

    int  sum = 0;
    void sumarray(){
        for ( int i = 0; i< arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of the array is : " + sum);
    }
}
public class sum {
public static void main(String[] args){
    array obj = new array();
    obj.sumarray();

}
    
}
