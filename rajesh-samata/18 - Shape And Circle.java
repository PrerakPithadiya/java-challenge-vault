package Rajesh_Sir_Problems;

// Shape class
class Shape {
    // Method to calculate perimeter (default implementation)
    public double getPerimeter() {
        return 0.0; // Default implementation for any shape
    }

    // Method to calculate area (default implementation)
    public double getArea() {
        return 0.0; // Default implementation for any shape
    }
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    // Data field
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate perimeter (overrides superclass method)
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate area (overrides superclass method)
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
class ShapeAndCircle {
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Circle circle = new Circle(23.54);

        // Calculate and print perimeter and area of the circle
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}