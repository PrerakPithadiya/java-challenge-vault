#include <iostream>
using namespace std;

// Class representing a complex number
class Complex {
private:
    double real;
    double imag;

public:
    // Constructor to initialize real and imaginary parts
    Complex(double r = 0.0, double i = 0.0) : real(r), imag(i) {}

    // Function to add two complex numbers
    Complex add(Complex c) {
        Complex sum;
        sum.real = real + c.real;
        sum.imag = imag + c.imag;
        return sum;
    }

    // Function to display the complex number
    void display() {
        cout << "Complex number: " << real << " + " << imag << "i" << endl;
    }
};

int main() {
    double real1, imag1, real2, imag2;

    // Input the real and imaginary parts of two complex numbers
    cout << "Enter first complex number: ";
    cin >> real1 >> imag1;
    cout << "Enter second complex number: ";
    cin >> real2 >> imag2;

    // Create objects for the two complex numbers
    Complex complex1(real1, imag1);
    Complex complex2(real2, imag2);

    // Calculate the sum of the two complex numbers
    Complex sum = complex1.add(complex2);

    // Display the sum
    cout << "Sum of the two complex numbers: ";
    sum.display();

    return 0;
}
