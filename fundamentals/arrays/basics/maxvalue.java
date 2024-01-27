// wap to caluclate the maximum value of all the elements in the given array


class array{
    int arr [] ={1,5,3,4,6,7,67,45,76,35,567,864,3534,5,6};

    int answer = 0;

    void maxarray()
    { for (int i = 0; i<arr.length ; i++){
        if(answer<arr[i])
        answer = arr[i];
    }
    System.out.println(answer);
    }
}
public class maxvalue {
    public static void main(String[] args) {
        array obj = new array();

        obj.maxarray();
    }
}
