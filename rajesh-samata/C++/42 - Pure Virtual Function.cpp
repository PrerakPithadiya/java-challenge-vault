#include <iostream>
using namespace std;

// Abstract base class
class Shape {
public:
    // Pure virtual function to calculate area
    virtual float area() = 0;

    // Virtual function to display shape type
    virtual void displayType() {
        cout << "This is a Shape" << endl;
    }
};

// Derived class (Rectangle) inherits from Shape
class Rectangle : public Shape {
private:
    float length;
    float width;

public:
    // Constructor
    Rectangle(float l, float w) : length(l), width(w) {}

    // Implementation of pure virtual function
    float area() override {
        return length * width;
    }

    // Override base class function
    void displayType() override {
        cout << "This is a Rectangle" << endl;
    }
};

// Derived class (Circle) inherits from Shape
class Circle : public Shape {
private:
    float radius;

public:
    // Constructor
    Circle(float r) : radius(r) {}

    // Implementation of pure virtual function
    float area() override {
        return 3.14159 * radius * radius;
    }

    // Override base class function
    void displayType() override {
        cout << "This is a Circle" << endl;
    }
};

int main() {
    // Creating objects of derived classes
    Rectangle rect(5, 4);
    Circle circle(3);

    // Call member functions
    rect.displayType();
    cout << "Area of rectangle: " << rect.area() << endl;

    circle.displayType();
    cout << "Area of circle: " << circle.area() << endl;

    return 0;
}
