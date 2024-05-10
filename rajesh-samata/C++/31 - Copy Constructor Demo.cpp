#include <iostream>
using namespace std;

// Class definition
class MyClass {
private:
    int data;

public:
    // Constructor
    MyClass(int val) : data(val) {}

    // Copy constructor
    MyClass(const MyClass &obj) {
        cout << "Copy constructor called!" << endl;
        data = obj.data;
    }

    // Function to display data
    void display() {
        cout << "Data: " << data << endl;
    }
};

int main() {
    // Create an object of MyClass
    MyClass obj1(10);

    // Create another object and initialize it using copy constructor
    MyClass obj2 = obj1;

    // Display data of both objects
    cout << "Object 1:" << endl;
    obj1.display();
    cout << "Object 2:" << endl;
    obj2.display();

    return 0;
}
