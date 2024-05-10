#include <iostream>
using namespace std;

// Class representing a Point in 2D space
class Point {
private:
    int x;
    int y;

public:
    // Constructor
    Point(int xVal = 0, int yVal = 0) : x(xVal), y(yVal) {}

    // Function to display coordinates of the point
    void display() {
        cout << "Point(" << x << ", " << y << ")" << endl;
    }
};

// Function that takes an object of class Point as an argument
void displayPoint(Point p) {
    cout << "Inside displayPoint function:" << endl;
    p.display();
}

int main() {
    // Create an object of class Point
    Point pointObj(3, 4);

    // Call the function and pass the object as an argument
    displayPoint(pointObj);

    return 0;
}
