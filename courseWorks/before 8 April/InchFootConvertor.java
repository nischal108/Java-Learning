import java.util.Scanner;

class InchConverter {
    double inches;

    InchConverter(double inches) {
        this.inches = inches;
    }

    double toFeet() {
        return inches / 12.0;
    }
}

public class InchFootConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();

        InchConverter converter = new InchConverter(inches);
        double feet = converter.toFeet();

        System.out.println(inches + " inches is equal to " + feet + " feet.");

        scanner.close();
    }
}
