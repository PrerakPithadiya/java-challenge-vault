#include <iostream>
using namespace std;

// Class definition
class MyClass {
public:
    // Constructor
    MyClass() {
        cout << "Constructor called!" << endl;
    }

    // Destructor
    ~MyClass() {
        cout << "Destructor called!" << endl;
    }
};

int main() {
    cout << "Creating object..." << endl;
    MyClass obj; // Creating an object of MyClass
    cout << "Object created." << endl;

    cout << "Exiting scope..." << endl;
    // Object obj goes out of scope here and gets destroyed
    cout << "Scope exited." << endl;

    return 0;
}
