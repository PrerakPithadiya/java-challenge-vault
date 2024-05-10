#include <iostream>
using namespace std;

// Inline function to find the square of a number
inline int square(int num) {
    return num * num;
}

// Inline function to find the cube of a number
inline int cube(int num) {
    return num * num * num;
}

int main() {
    int number;
    cout << "Enter an integer number: ";
    cin >> number;

    // Calculate square and cube using inline functions
    int squareResult = square(number);
    int cubeResult = cube(number);

    cout << "Square of " << number << " is: " << squareResult << endl;
    cout << "Cube of " << number << " is: " << cubeResult << endl;

    return 0;
}
