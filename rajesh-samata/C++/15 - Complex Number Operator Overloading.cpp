#include <iostream>
using namespace std;

class Complex {
private:
    double real, imaginary;

public:
    Complex(double r = 0.0, double i = 0.0) : real(r), imaginary(i) {}

    Complex operator+(const Complex& other) {
        return {real + other.real, imaginary + other.imaginary};
    }

    void display() {
        cout << real << " + " << imaginary << "i" << endl;
    }
};

int main() {
    Complex num1(2.5, 3.7), num2(1.3, 4.2);

    cout << "First complex number: ";
    num1.display();

    cout << "Second complex number: ";
    num2.display();

    cout << "Sum of complex numbers: ";
    (num1 + num2).display();

    return 0;
}
