#include <iostream>
using namespace std;

class Adder {
public:
    static int add(int num1, int num2) {
        return num1 + num2;
    }
};

int main() {
    int num1 = 10, num2 = 20;
    int sum = Adder::add(num1, num2); // Using scope resolution operator to access the static member function

    cout << "Sum of " << num1 << " and " << num2 << " is: " << sum << endl;

    return 0;
}
