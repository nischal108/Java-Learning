class helloWorld{
    //declaring an array 

    String cars[] ={ "alto","merchedes", "mustang"};

    //declaring a 2d array 
    String bikes[] [] = {{"honda", "splender" , "ktm" }, {"rickshaw", "cycle", "bullet"}};

    //bike function using for loops
    void showbikes(){
        for(int i=0; i<2; i++){
            for(int j =0; j<3; j++){
                System.out.println(bikes[i][j]);
            }
        }
    }

    //function with a code to show the cars name generally 
   void showcars(){
    System.out.println(cars[2]);
    }


    //functions to display the elements using loops 
    void byloops(){

        //for loops 

        //     for(int i =0 ; i<=2;i++){
        // System.out.println(cars[i]);


        //foreach
        for(String car : cars){
            System.out.println(car);
        }


    }
    }

public class array3{
    public static void main(String[] args) {
        helloWorld obj = new helloWorld();
        obj.showbikes();
    }
}