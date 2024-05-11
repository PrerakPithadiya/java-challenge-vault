#include <iostream>
using namespace std;

class Shape {
public:
    virtual void displayArea() {
        cout << "Area of shape is undefined." << endl;
    }
};

class Rectangle : public Shape {
private:
    double length;
    double width;

public:
    Rectangle(double l, double w) : length(l), width(w) {}

    // Override the displayArea function
    void displayArea() override {
        cout << "Area of rectangle: " << length * width << endl;
    }
};

class Circle : public Shape {
private:
    double radius;

public:
    Circle(double r) : radius(r) {}

    // Override the displayArea function
    void displayArea() override {
        cout << "Area of circle: " << 3.14159 * radius * radius << endl;
    }
};

int main() {
    Shape* shape1 = new Rectangle(5.0, 4.0);
    Shape* shape2 = new Circle(3.0);

    // Call displayArea using pointers
    shape1->displayArea();
    shape2->displayArea();

    delete shape1;
    delete shape2;

    return 0;
}
