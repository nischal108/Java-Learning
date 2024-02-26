
import java.util.Scanner;

 
class Account{
    int accNo;
    String name;
    float amount;
    void createAccount( int ac, String naam, float amnt){
        accNo = ac;
        name = naam;
        amount = amnt;
    }
    void deposit(float depositedAmmount){
        amount += depositedAmmount;
    }

    void withdraw(float withdrawAmount){
        if(amount<=0){
            System.out.println("Insufficient balance");
        }
        else{
            amount-= withdrawAmount;
        }
    }
    void displayBalance(){
        System.out.println("Your current balance is " + amount);
    }


}




public class BankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean repeat = true;
        Account customer = new Account();

       do{
         System.out.println("What do you want to do ? \n");
        System.out.println("1. Create Account \n 2. Withdraw \n 3. Deposit \n 4. Display Balance \n 5. Exit ");
        int inputNumber = sc.nextInt();
        switch(inputNumber){
            case 1: {
               
                System.out.print("Enter the customer account number: ");
                int enteredCustomerNumber = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter the name of the customer :");
                String enteredName = sc.nextLine();

                System.out.print("Enter the opening balance : ");
                float enteredBalance = sc.nextFloat();
                

                customer.createAccount(enteredCustomerNumber, enteredName, enteredBalance);
                break;
            }
            case 2 : {
                System.out.print("Enter the amount you want to withdraw : ");
                float withdrawlAmount = sc.nextFloat();
                customer.withdraw(withdrawlAmount);
                break;
            }

            case 3: {
                System.out.print("Enter the amount you want to deposit : ");
                float depositAmount = sc.nextFloat();
                customer.deposit(depositAmount);
                break;
            }
            case 4 : {
                customer.displayBalance();
                break;
            }
            case 5:{
                repeat= false;
                break;
            }
            default :{
                System.out.println("You choose a wrong option");
                break;
            }
        }

       } while(repeat);


        sc.close();
    }
}
