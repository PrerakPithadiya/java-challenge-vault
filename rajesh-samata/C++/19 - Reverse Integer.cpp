#include <iostream>
using namespace std;

int main() {
    int number, reversedNumber = 0;

    // Input the number
    cout << "Enter a number: ";
    cin >> number;

    // Reverse the digits using a while loop
    while (number != 0) {
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }

    // Output the reversed number
    cout << "Reversed number: " << reversedNumber << endl;

    return 0;
}
