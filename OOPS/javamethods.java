

//functions are called just by their on the other hand methos is called using objects.

// public class javamethods{
    
//     static  void sum() {
//         System.out.println("hello world");
//     }
//     public static void main(String[] args) {
//         sum();
//     }
// }
import java.util.Scanner;
class Algebra{
    int add (int a, int b){
        return a+b;
    }
}

public class javamethods{
    public static void main(String[] args) {
       
        //creating the object of class algebra and scanner
        Algebra hero = new Algebra();
        Scanner sc = new Scanner(System.in);
        
        //taking input from user
        int x = sc.nextInt();
        int y = sc.nextInt();

        //to print the answer statement without line gap
        System.out.print("the output of givrn number is : ");

        //storing the returned value by the function in a  variable named ans
        int ans =hero.add(x,y);
        
        // the value returned by the function of object add of class Algebra was stored in an variable named ans 
        System.out.println(ans);
    }
}