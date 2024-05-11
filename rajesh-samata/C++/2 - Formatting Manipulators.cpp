#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int num = 123;
    double pi = 3.14159265358979323846;

    // setw - sets the width of the field
    cout << setw(10) << "Number:" << setw(5) << num << endl;

    // setfill - sets the fill character for the field
    cout << setfill('*') << setw(10) << "Number:" << setw(5) << num << endl;

    // setprecision - sets the number of digits to be displayed after the decimal point
    cout << setprecision(5) << "Pi: " << pi << endl;

    // setiosflags - sets various formatting flags
    cout << setiosflags(ios::fixed) << setprecision(2) << "Pi: " << pi << endl;

    // resetiosflags - resets formatting flags
    cout << resetiosflags(ios::fixed) << setprecision(6) << "Pi: " << pi << endl;

    // endl equivalent IOS functions
    cout << "Hello, " << flush; // flushes the output buffer
    cout << "world!" << ends;   // appends a null character to the stream
    
    // width - sets the width of the field
    cout.width(10);
    cout << "Number:";
    cout.width(5);
    cout << num << endl;

    // fill - sets the fill character for the field
    cout.fill('*');
    cout.width(10);
    cout << "Number:";
    cout.width(5);
    cout << num << endl;

    // precision - sets the number of digits to be displayed after the decimal point
    cout.precision(5);
    cout << "Pi: " << pi << endl;

    // setf - sets various formatting flags
    cout.setf(ios::fixed);
    cout.precision(2);
    cout << "Pi: " << pi << endl;

    // unsetf - unsets formatting flags
    cout.unsetf(ios::fixed);
    cout.precision(6);
    cout << "Pi: " << pi << endl;

    return 0;
}
