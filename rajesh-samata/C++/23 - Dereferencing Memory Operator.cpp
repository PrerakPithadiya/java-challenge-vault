#include <iostream>
using namespace std;

int main() {
    int num = 10;
    int* ptr = &num;

    // Display the value of num and the address stored in ptr
    cout << "Value of num: " << num << endl;
    cout << "Address stored in ptr: " << ptr << endl;

    // Dereferencing the pointer to access the value stored at the address it points to
    cout << "Value stored at the address pointed by ptr: " << *ptr << endl;

    // Modifying the value using dereferencing
    *ptr = 20;
    cout << "Modified value of num: " << num << endl;

    return 0;
}
