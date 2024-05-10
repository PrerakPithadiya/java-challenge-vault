#include <iostream>
using namespace std;

class MyClass {
private:
    int num;

public:
    // Declaration of inline member function outside the class
    inline void setNum(int n);

    // Definition of inline member function outside the class
    void displayNum();
};

// Definition of inline member function outside the class
inline void MyClass::setNum(int n) {
    num = n;
}

// Definition of non-inline member function outside the class
void MyClass::displayNum() {
    cout << "Value of num: " << num << endl;
}

int main() {
    MyClass obj;

    // Call to inline member function
    obj.setNum(10);

    // Call to non-inline member function
    obj.displayNum();

    return 0;
}
