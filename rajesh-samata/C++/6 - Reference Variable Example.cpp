#include <iostream>
using namespace std;

int main() {
    int num = 10;
    int& ref = num; // Reference variable ref is created and initialized with num

    cout << "Value of num: " << num << endl;
    cout << "Value of ref: " << ref << endl;

    num = 20; // Changing the value of num
    cout << "Value of num after modification: " << num << endl;
    cout << "Value of ref after modification: " << ref << endl;

    ref = 30; // Changing the value of ref (also changes the value of num)
    cout << "Value of num after modifying ref: " << num << endl;
    cout << "Value of ref after modifying ref: " << ref << endl;

    return 0;
}
