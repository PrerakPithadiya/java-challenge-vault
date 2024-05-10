#include <iostream>
using namespace std;

// Forward declaration of the Circle class
class Circle;

// Friend function declaration
double calculateArea(const Circle& c);

// Circle class definition
class Circle {
private:
    double radius;

public:
    // Constructor
    Circle(double r) : radius(r) {}

    // Declaration of friend function
    friend double calculateArea(const Circle& c);
};

// Definition of the friend function
double calculateArea(const Circle& c) {
    // Area of circle = pi * radius * radius
    return 3.14159 * c.radius * c.radius;
}

int main() {
    double radius;

    // Input the radius of the circle
    cout << "Enter the radius of the circle: ";
    cin >> radius;

    // Create a Circle object
    Circle circle(radius);

    // Calculate and display the area using the friend function
    cout << "Area of the circle: " << calculateArea(circle) << endl;

    return 0;
}
