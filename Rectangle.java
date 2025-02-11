public class Rectangle {
    // Attributes with default values
    private double length;
    private double width;

    // Constructor with default values for length and width
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Constructor with parameters to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getters
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    // Method to calculate area
    public double calculateArea() {
        return this.length * this.width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a rectangle object
        Rectangle rect = new Rectangle();

        // Set length and width
        rect.setLength(5);
        rect.setWidth(3);

        // Get the area
        double area = rect.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
