public class oops{
    static String book_name ;
    static float book_price;

    static void setBook(String name,float price){
        book_name = name;
        book_price = price;
    }

    static void displayDetails(){
        System.out.println("THe name of the book is "+ book_name);
        System.out.println("The price of the book is " + book_price);
    }

    public static void main(String[] args) {
        setBook("Harry Potter", 12.00f);
        displayDetails();
    }
}