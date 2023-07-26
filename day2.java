import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner man = new Scanner(System.in);
        

        // NAMING CONVENTION IN JAVA 

        // lowe case :nischalbhattarai             package
        // camel case: nischalbhattarai            functions variable
        // pascal case:NischalBhattarai            packages
        // snake case (upper):NISCHAL_BHATTARAI    constants


        // java identifiers
        // names for any components in java like method name, class name, etc
            // naming convention ma suru ma _ , $ ra letter hunu parxa not number
            // this is case sensitive 
            // reserved words can't be used
            // white space is not permitted



            // java data types

            // primitive data types   =   built in data types provided by java    , holds single values,     cannot be dvided
            // non primitive data types =  user defined data types,                holds memory address of a variable          , com.sun.jndi.ldap.ext



        //     primitive:
        //     boolean     true or fales       boolean flag = false;
        //     char            stores characters   letters, symbols like @     numbers in store handinxa 
        //     byte 
        //     short
        //     int         
        //     long
        //     double            fractional store garxa
        //     float               "                  "




        // non primitive data types   / user defined

        // strings              multiple char
        // arrays
        // classes
        // interfaces



                //    TAKING INPUTS IN JAVA


                // java provides a scanner class for us to take input from user the class is inside a packega named java.util
                //    suppose there a car class with objects bmw and method run also attribute color
                //    how to make object of a car?
                //    className objName = new  constructor/classname ( attribute)
                //    class BMW = new car("BMW",red)

                // accessing attribute or method through obj
                // bmw.color
                // bmw.run()


                // we use this to take input
                // we first make a new obj of scanner class provided by java

                // scanner sc = new scanner(System.in)
                // we made a obj named sc of class scanner and the  system.in   refers to take input from standard place like keyboard
                // to use this scanner class we need to import  so we write      "import java.util.Scanner"    at the top

System.out.println("enter a number");
int no1 = man.nextInt();
//nextInt is a method in no.1 object as per System class
// integer lai nextInt
// string lai next matra
System.out.println("you entered " +no1);

// try a string 
//next method le space agadi herdaina of a user writes ram karki then the scanner only sees ram due to next method
System.out.println("Enter your first name");
String fname = man.next();
System.out.println("Hello " +fname);

// if we write nextLine method esle space agadi ko ni herxa


 // the object i made is closed here to prevent resource leak tyo afu baseko memory xosxa aba
                //   program to add two number given by user

                System.out.print("Enter the first number :");
                int a = man.nextInt();

                System.out.println("Enter the second number = ");
                int b = man.nextInt();

                System.out.println("the addition of these numbers is " + (a+b));
                
man.close();

    }
    
}
