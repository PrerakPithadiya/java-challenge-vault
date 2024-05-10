#include <iostream>
using namespace std;

class Arithmetic {
private:
    int operand1;
    int operand2;

public:
    Arithmetic(int op1, int op2) {
        operand1 = op1;
        operand2 = op2;
    }

    int add() {
        return operand1 + operand2;
    }

    int subtract() {
        return operand1 - operand2;
    }

    int multiply() {
        return operand1 * operand2;
    }

    double divide() {
        if (operand2 == 0) {
            cout << "Error: Division by zero!" << endl;
            return 0;
        }
        return static_cast<double>(operand1) / operand2;
    }
};

int main() {
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    Arithmetic calc(num1, num2);

    cout << "Sum: " << calc.add() << endl;
    cout << "Difference: " << calc.subtract() << endl;
    cout << "Product: " << calc.multiply() << endl;
    cout << "Quotient: " << calc.divide() << endl;

    return 0;
}
