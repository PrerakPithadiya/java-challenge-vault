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

    // Function to add two points
    Point add(Point p) {
        Point sum;
        sum.x = x + p.x;
        sum.y = y + p.y;
        return sum;
    }
};

int main() {
    // Create two objects of class Point
    Point point1(3, 4);
    Point point2(5, 6);

    // Call the add function with point2 as argument and store the result in sumPoint
    Point sumPoint = point1.add(point2);

    // Display the result
    cout << "Result of adding two points: ";
    sumPoint.display();

    return 0;
}
