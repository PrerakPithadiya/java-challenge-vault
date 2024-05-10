#include <iostream>
using namespace std;

int main() {
  // Implicit type conversion (promotion)
  int num_int = 10;
  double num_double = num_int; // Implicit conversion from int to double
  cout << "Implicit type conversion (promotion): " << num_double << endl;

  // Explicit type casting
  double double_num = 3.14;
  int int_num =
      static_cast<int>(double_num); // Explicit conversion from double to int
  cout << "Explicit type casting: " << int_num << endl;

  // C-style casting
  float float_num = 2.5;
  int casted_int = (int)float_num; // C-style casting from float to int
  cout << "C-style casting: " << casted_int << endl;

  // Function-style casting
  char char_num = 'A';
  int ascii_value = int(char_num); // Function-style casting from char to int
  cout << "Function-style casting: " << ascii_value << endl;

  return 0;
}
