// // // Mission java 

// // java is a high level program with .java extension




// // java architecutre

// // java doesn't directly convert high level code to machine
// // rather it converts it to bytecode with .class extension

// // source code  is compled to bytecode and bytecode is further interpreted to machine code


// // .class file (byte code) is further interpreted by JVM (java virtual machine)  to machine code.




// // why this extra step?

// // because this makes java platform independent.

// // code written in windows runs on macos and linux as well if it has jvm it is not the same case with other languages

// // compile once run everywhere




// // java architecure components

// // jvm( java virtual machine)

// //         3 main components
// //     class loader   ---> loads byte code to main memory area
// //     memory area-----> memory required for the program ( datas used in ths program) is allocated in this area 
// //     execution engine   ---->  interpreter + jit ompiler + garbage collector 
// //                          -->  interpreter (line by line translation)      jit compiler(interpreter slow bhako le garda  
// //                                 dherai choti lekheko repeated portion of the code is compiled by this compiler to enhance the performance of jvm)
// //                                   garbage collector ( deallocates the unused memory,  use nabhako memory delete garxa , yaha automatc hunxa uta c ma chai hamile aafai garnu parxa)  


// // jre (java runtime environment)

// // jvm + libraries
// //  java ma use hune librabris haru dinxa esle


// //  jdk (java development kit)
// //    jre  +   compiler   + chaine debugging tools +  chianxa bhane montioring tools + automatic document generate garna java doc 
// //    esto fancy kuro ni misauda jdk banxa

// //    so jdk is final thing esma chai sabai kuro aayo !!!!




//     //         java  variables and OUtput


//     // Output
    
//     System.out.println();   prints in a line and  a /n at the end, the next line begins from the other line
    
//     System.out.print();  prints generally without /n



//     hello world program 


public class day1 {
  public static void main(String[] args) {
    System.out.println("hello world");
    

// the above program prints hello world
// //  yo code aba java compiler le byte code ma lanxa ani tesle pheri jvm le execute garera machine code banauxa
// hamile yo code la terminal bata ni run garna sakxum 


// first hamile eslai byte code ma lanu paro 
// for this  we type  javac .filename.java


// aba hamro folder ma naya file aauxa with extension .class 


// aba hani tyo byte code lai machine code ma lagera execute garxum for this we type:
//  java filename     ( .java nalekhne yaha chai just name)


// harek choti change garepixe 2 tai step garnu parxa 




// lets break down the code and understand 

        //    public class day1  
                //  java is a object oriented program so everything in java is written in classes
                // class is a user defined blue print consisting of attributes and methods
                               
                
                //  suppose if there is a class called car 
                                //          its attributes are color price company 
                                //         its methods (functions nei ho java ma fancy bhasa ma methods) are   run , open window,  start
                                // objects of this class are  bmw, audi, honda, suzuki 

                                // aba malai  suppose  audi ko color thapauna man lago i will write   audi.color
                                //  similarly i want my audi to run then i will      write audi.run()    , yo chai method ho so ()                

            // public static void main(String[] args) {
            // }
                        //  void main is a function
                        //  function is a piece of code that is called repeadetly ( yaha deko tyo srting k k bhaneko main function lai deko  data, input ho )
                        // type void bhaneko it returns nothing
                        // main is a function name , esko name jaile main nei hunxa java le jaile main function run garxa code execute garda 
                        // public bhaneko access modifier  yo function lai jaha pani use garda hunxa bhaneko ho 
                        // static allows us to call us the method without creating and object  agi ko gaadi wala example mathi ma hamlai car ko name chaiyeko thyo like audi .run ()  yaha tehi name xaina class nabanara we use static 
                        // string[]args bhaneko command line  arguments ho default wala
                        //             string[] string haru ko list xa bhaneko esle esma dherai parameters huna sakxa
                        //              args bhaneko name ho tyo j rakhda ni hunxa standard ma hami args use garxum 
                        //              hamile tyo program lai run garda compile garera java filename one two , lekhim bhane aba hamro main ma bhako tham ma one two bhanne parameter pass bhayo 
                        //              tya aba list nei bhako le garda paxi function ma we write args[0], args[1]...........



            // System.out.println
                                //  print in next line bhaneko 
                                //   system bhaneko euta class ho java ko esle chai hamlai  standard input output stream haru provide garxa
                                //   out euta object ho print stream bhanne class ko
                                //   println()   is a function/ method in print stream class






                // JAVA variables

                                // titles of reserved memory location


                                // Syntax for declaring a java variables

                                // type variable_name = value;

                                // eg: int a = 5;

                                int money= 2000;
                                System.out.println(money);
                                //  generates output as 2000

                                // eutai variable dherai choti use garinxa value change gardai bhane tesko data type ekchoti matra declare garda hunxa

                                int a= 90;
                                System.out.println(a);

                                a = 98;
                                System.out.println(a);
    }
}