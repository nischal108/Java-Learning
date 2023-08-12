
class array{
    void arrayCall(){

        //way 1 of creating an array
        // int [] myNumbers = new int[4];
        // myNumbers[0]=1;
        // myNumbers[1]=5;
        // myNumbers[2]=6;
        // myNumbers[3]=5;


        //way 2 of creating an array
        int [] myNumbers ={1,2,3};


        //accessing the particular element of the array
        System.out.println(myNumbers[2]);
    }
}
public class day1 {
    public static void main(String[] args) {

        array nischal = new array();
        nischal.arrayCall();
            
    }
}
