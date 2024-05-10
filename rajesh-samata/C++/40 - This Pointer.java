#include <iostream>
using namespace std;

class MyClass {
private:
    int num;

public:
    // Constructor
    MyClass(int num) {
        // Using this pointer to differentiate between member variable and constructor parameter
        this->num = num;
    }

    // Method to display member variable
    void display() {
        // Using this pointer to access member variable
        cout << "Value of num: " << this->num << endl;
    }

    // Method to compare two objects
    bool isEqual(MyClass &obj) {
        // Using this pointer to access member variable of calling object
        return this->num == obj.num;
    }
};

int main() {
    // Creating objects of MyClass
    MyClass obj1(5);
    MyClass obj2(10);

    // Displaying values
    obj1.display();
    obj2.display();

    // Comparing objects
    if (obj1.isEqual(obj2)) {
        cout << "Objects are equal" << endl;
    } else {
        cout << "Objects are not equal" << endl;
    }

    return 0;
}
