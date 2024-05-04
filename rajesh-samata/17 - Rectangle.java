package Rajesh_Sir_Problems;

class Rectangle {
    // Data fields
    private double width;
    private double height;

    // Constructors
    // No-argument constructor to create a default rectangle
    public Rectangle() {
        this.width = 1.0; // Default width
        this.height = 1.0; // Default height
    }

    // Constructor to create a rectangle with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Methods
    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getters and setters for width and height (optional)
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a default rectangle
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        printRectangleProperties(defaultRectangle);

        // Create a rectangle with specified width and height
        Rectangle customRectangle = new Rectangle(34, 12);
        customRectangle.setHeight(87);
        customRectangle.setWidth(45);
        System.out.println("\nCustom Rectangle:");
        printRectangleProperties(customRectangle);
    }

    // Method to print properties of a rectangle
    public static void printRectangleProperties(Rectangle rectangle) {
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}