#include <iostream>
using namespace std;

class MathOperations {
public:
    // Function to add two integers
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // Function to add three integers
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Function to add two double numbers
    double add(double num1, double num2) {
        return num1 + num2;
    }
};

int main() {
    MathOperations mathObj;

    // Add two integers
    cout << "Sum of 5 and 10: " << mathObj.add(5, 10) << endl;

    // Add three integers
    cout << "Sum of 5, 10, and 15: " << mathObj.add(5, 10, 15) << endl;

    // Add two double numbers
    cout << "Sum of 3.5 and 2.5: " << mathObj.add(3.5, 2.5) << endl;

    return 0;
}
