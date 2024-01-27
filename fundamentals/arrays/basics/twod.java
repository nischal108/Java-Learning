class array{
    void hello(){
        //declaring a 2d array

        int [] [] ages = new int [5] [4];
        //This statement has declared an array with 5 elements and each elments have array with 4 elements

        //inserting elements in 2d array
        ages[3][3]= 0;


        //accessing the elemts in 2d array

        System.out.println(ages[3][3]);

        //different way of declaring array

        int [] [] umer ={{2,4,5,6},{3,4,5,6}};

        //accessing the element of array 

        System.out.println(umer[1][0]);


        //finding the length of an array
        System.out.println(umer.length);
        System.out.println(umer[0].length);

    }
}
public class twod {
    public static void main(String[] args) {
        array object = new array();

        object.hello();
        
    }
    
}
