import java.util.Scanner;

public class DaySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to represent the day of the week: ");
        int dayNumber = sc.nextInt();

        String day;

        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number";
        }

        System.out.println("The day is: " + day);

        sc.close();
    }
}
