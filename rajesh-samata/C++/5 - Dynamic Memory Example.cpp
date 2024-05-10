#include <iostream>
using namespace std;

int main() {
    int* ptr = new int;
    *ptr = 10;

    cout << "Value stored in dynamically allocated memory: " << *ptr << endl;

    int size = 5;
    int* arr_ptr = new int[size];

    cout << "Enter " << size << " integers:" << endl;
    for (int i = 0; i < size; ++i) {
        cin >> arr_ptr[i];
    }

    cout << "Values stored in dynamically allocated array: ";
    for (int i = 0; i < size; ++i) {
        cout << arr_ptr[i] << " ";
    }
    cout << endl;

    delete ptr;
    delete[] arr_ptr;

    return 0;
}
