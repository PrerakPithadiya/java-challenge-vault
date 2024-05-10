#include <iostream>
using namespace std;

// Class definition
class Box {
private:
    double length;
    double width;
    double height;

public:
    // Constructor with no parameters
    Box() {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }

    // Constructor with one parameter (for a cube)
    Box(double side) {
        length = side;
        width = side;
        height = side;
    }

    // Constructor with three parameters
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Function to calculate volume
    double volume() {
        return length * width * height;
    }
};

int main() {
    // Create objects of Box class using different constructors
    Box box1; // Default constructor
    Box box2(5.0); // Constructor for cube
    Box box3(3.0, 4.0, 5.0); // Constructor with three parameters

    // Calculate and display volumes
    cout << "Volume of box1: " << box1.volume() << endl;
    cout << "Volume of box2: " << box2.volume() << endl;
    cout << "Volume of box3: " << box3.volume() << endl;

    return 0;
}
