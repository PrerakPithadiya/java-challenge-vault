#include <iostream>
using namespace std;

void swapByValue(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

void swapByReference(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    int num1 = 10, num2 = 20;

    cout << "Before swapping:" << endl;
    cout << "num1 = " << num1 << ", num2 = " << num2 << endl;

    swapByValue(num1, num2);
    cout << "\nAfter swapping by value:" << endl;
    cout << "num1 = " << num1 << ", num2 = " << num2 << endl;

    num1 = 10;
    num2 = 20;

    swapByReference(num1, num2);
    cout << "\nAfter swapping by reference:" << endl;
    cout << "num1 = " << num1 << ", num2 = " << num2 << endl;

    return 0;
}
