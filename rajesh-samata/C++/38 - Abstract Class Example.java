abstract class Shape {
    // Abstract method to calculate area
    abstract float area();

    // Method to display shape type
    void displayType() {
        System.out.println("This is a Shape");
    }
}

class Rectangle extends Shape {
    private float length;
    private float width;

    Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    // Implementation of abstract method
    float area() {
        return length * width;
    }

    // Override base class method
    void displayType() {
        System.out.println("This is a Rectangle");
    }
}

class Circle extends Shape {
    private float radius;

    Circle(float r) {
        radius = r;
    }

    // Implementation of abstract method
    float area() {
        return (float) (3.14159 * radius * radius);
    }

    // Override base class method
    void displayType() {
        System.out.println("This is a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of derived classes
        Rectangle rect = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        // Call member functions
        rect.displayType();
        System.out.println("Area of rectangle: " + rect.area());

        circle.displayType();
        System.out.println("Area of circle: " + circle.area());
    }
}
