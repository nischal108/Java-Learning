public class Rectangle {
    private double width;
    private double length;
    private double area;
    private String colour;

    // Constructor
    public Rectangle(double width, double length, String colour) {
        this.width = width;
        this.length = length;
        this.colour = colour;
        this.area = width * length;
    }

    // Getter and setter methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.area = this.width * this.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        this.area = this.width * this.length;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        return area;
    }

    // Method to compare rectangles
    public static void compareRectangles(Rectangle rect1, Rectangle rect2) {
        if (rect1.getArea() == rect2.getArea() && rect1.getColour().equals(rect2.getColour())) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non-matching Rectangles");
        }
    }

    public static void main(String[] args) {
        // Creating two Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 10.0, "Red");
        Rectangle rect2 = new Rectangle(5.0, 10.0, "Red");

        // Comparing the rectangles
        compareRectangles(rect1, rect2);
    }
}
