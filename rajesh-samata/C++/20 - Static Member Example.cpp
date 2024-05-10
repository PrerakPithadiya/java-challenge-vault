#include <iostream>
using namespace std;

class MyClass {
private:
    static int count; // Static member variable

public:
    MyClass() {
        count++; // Increment count each time an object is created
    }

    // Static member function to get the count of objects created
    static int getCount() {
        return count;
    }
};

// Initializing static member variable
int MyClass::count = 0;

int main() {
    cout << "Initial count of objects: " << MyClass::getCount() << endl;

    MyClass obj1;
    MyClass obj2;

    cout << "Count of objects after creating two objects: " << MyClass::getCount() << endl;

    MyClass obj3;

    cout << "Count of objects after creating three objects: " << MyClass::getCount() << endl;

    return 0;
}
