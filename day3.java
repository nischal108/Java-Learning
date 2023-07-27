import java.util.Scanner;
//the package that is used for taking inputs is loaded , theere is a class named Scanner in tha package

public class day3 {
    public static void main(String[] args) {
// a object named hello of class Scanner is created
        Scanner hello = new Scanner(System.in);

        System.out.println("Enter the principal");
        float principal = hello.nextFloat();
// method of the object hello is used. this method allows us to take float as a input and store it (here in principal);
        System.out.println("Enter the rate");
        float rate = hello.nextFloat();

        System.out.println("Enter the time");
        float time = hello.nextFloat();

        float si = (principal*time*rate)/100;

        System.out.println("The simple interest is : " +si );
      //the object is closed using its another method

      // we can do such that only read or store the character at certain position form a string given by user. java has 0 indexing meaning counting starts from 0 
      System.out.println("Enter the string and I will tell you what is the 3rd character of the string");
      char me = hello.next().charAt(2);

      //tyo thapeko .charAt(2) is another method of the object hello of class Scanner
      //mathi use gareko next le space dekhi kei padhdaina 
      //nextLine(); esle chai padhna sakxa purai string

      System.out.println("the 3rd character is " +me);


                                    // OPERATORS IN JAVA
                                    //  arithmetic operator +,-,*,/,%,++,--
                                    //relational operators:  == is equal to , != not equal to , >, <,<=,,>=
                                    //logical operatos   && and, || or  ! not
                                    //assignment operator =  +=    -=    /=     %=


                                    //java unary operators  , requires only one operand
                                    // sign  +    -     ++    --


                                    // post increment operator and pre increment operator
                                    // pre incrment paili  ani assignment
                                    // post ko incrment paila ani assignment


                                    // java operator precedence
                                    


        hello.close();

    }
    
}
