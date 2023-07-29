import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //program to check is the number entered by user is divisible by 5 or not

        System.out.println("Enter the number you would like to check if it is divisible by 5 or not");
        int number = sc.nextInt();

        if(number%5==0){
            System.out.println("The number you entered "+number+ " is divisible by 5");
        }
        else{
                System.out.println("The number you entered "+number+ " is not divisible by 5");
        }

        // //program to check if the entered year is leap year or not
        System.out.print("enter the year to check for the leap year : ");
        int year = sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("this is a leap year");
                }
                else{
                    System.out.println("This is not a leap year");
                }
            }
            else{
                System.out.println("This is a leap year");
            }
            
        }
        else{
                System.out.println("This is not a leap year");
            }

        //profit and loss finder and calculator 

        System.out.println("Enter your cost price : ");
        int cp = sc.nextInt();

        System.out.println("Enter your selling price : ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("You made a profit");
            int profit = sp-cp;
            System.out.println("You made " +profit+ " profit");
        }
        else{
            System.out.println("You made a loss");
            int loss = cp-sp;
            System.out.println("You made " +loss +" loss ");
        }

                    // -----------< Ternary OPerators >>>-----------

                    String result;
                    result = (sp>cp)? "profit" : "loss";
                    System.out.println(result);

                    //did the same thing as above one but more efficiently the rsult must be stored
                    //  in a variable and in this method always something needs to be returned.


                    //Switch case
            //alternate way of writing conditionals
            System.out.println("enter the day number");
            int numb = sc.nextInt();
            
            switch(numb){
                case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 7:
                System.out.println("Saturday");
                break;
                default:
                System.out.println("Invalid day number");
                break;
            }


        sc.close();
    }
    
}
