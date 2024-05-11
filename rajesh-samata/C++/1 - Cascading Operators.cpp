#include <iostream>
using namespace std;

class Number {
private:
    int value;

public:
    Number() : value(0) {}
    Number(int val) : value(val) {}

    // Overloading insertion operator (<<) to print Number object
    friend ostream& operator<<(ostream& os, const Number& num) {
        os << "Value: " << num.value;
        return os;
    }

    // Overloading extraction operator (>>) to read into Number object
    friend istream& operator>>(istream& is, Number& num) {
        cout << "Enter a value: ";
        is >> num.value;
        return is;
    }
};

int main() {
    Number num1, num2;

    cout << "Enter value for num1: ";
    cin >> num1;

    cout << "Enter value for num2: ";
    cin >> num2;

    cout << "Values entered:" << endl;
    cout << "num1: " << num1 << endl;
    cout << "num2: " << num2 << endl;

    return 0;
}
