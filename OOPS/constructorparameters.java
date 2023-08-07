// program to check if the created constructor of a class can accept parameters since it is also a method even thought it is specal

public class constructorparameters {
    String firstName;
    String lastName;

    //constructor of constructorparamters class created
    constructorparameters(String fn , String ln){
        firstName = fn;
        lastName = ln;
    }

    //main function begins
    public static void main(String[] args) {
        //creating the object of the class and using the above created constructor

        constructorparameters person = new constructorparameters("Nischal", "Bhattarai");


        //checking if what theory  says works and the new object have the attributes by default that was declared above in the constructor creation

        System.out.println(person.firstName + " " + person.lastName);
    }


    
}
