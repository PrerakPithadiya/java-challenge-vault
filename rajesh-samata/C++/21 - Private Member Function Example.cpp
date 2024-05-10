#include <iostream>
using namespace std;

class Calculator {
private:
    // Private member function to check if a number is positive
    bool isPositive(int num) {
        return num > 0;
    }

public:
    // Public member function to check if a number is positive
    void checkPositivity(int num) {
        if (isPositive(num)) {
            cout << num << " is positive." << endl;
        } else {
            cout << num << " is not positive." << endl;
        }
    }
};

int main() {
    Calculator calc;

    // Accessing public member function to check positivity of a number
    calc.checkPositivity(5);
    calc.checkPositivity(-3);

    return 0;
}
