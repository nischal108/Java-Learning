// this is a gpa calculator that tells the gpa obtained under the instructions provided by the user 
// this is made on the basis of latest GPA marking system by NEB

import java.util.Scanner;
public class gpacalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)

        //taking inputs from the user
        System.out.println("Enter your English mark (Th)");
        float Ength = sc.nextFloat();
        System.out.println("Enter your English mark (Pr)");
        float Engpr = sc.nextFloat();
        System.out.println("Enter your Nepali mark (Th)");
        float Nepth = sc.nextFloat();
        System.out.println("Enter your Nepali mark (Pr)");
        float Neppr = sc.nextFloat();
        System.out.println("Enter your Math mark (Th)");
        float mathth = sc.nextFloat();
        System.out.println("Enter your Math mark (Pr)");
        float mathpr = sc.nextFloat();
        System.out.println("Enter your Physics mark (Th)");
        float phyth = sc.nextFloat();
        System.out.println("Enter your Physics mark (Pr)");
        float Phypr = sc.nextFloat();
        System.out.println("Enter your Chemistry mark (Th)");
        float Chemth = sc.nextFloat();
        System.out.println("Enter your Chemistry mark (Pr)");
        float Chempr = sc.nextFloat();
        System.out.println("Enter your Computer mark (Th)");
        float Compth = sc.nextFloat();
        System.out.println("Enter your Computer mark (Pr)");
        float Comppr = sc.nextFloat();
        

        //necessary variables for credit hours
        float chtheng=3,chpreng=1;
        double chthnep= 2.25,chprnep=0.75,chthmath=3.75,chthphy=3.75, chthchem=3.75, chthcomp=3.75;
        double chprmath= 1.25, chprphy = 1.25, chprchem= 1.25, chprcomp = 1.25;

        
        
        sc.close();
    }
    
}
