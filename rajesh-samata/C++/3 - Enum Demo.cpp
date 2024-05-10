#include <iostream>
using namespace std;

// Define an enumeration type named Color
enum Color { RED, GREEN, BLUE, YELLOW, BLACK };

int main() {
  // Declare variables of type Color
  Color color1, color2;

  // Assign values to variables of type Color
  color1 = RED;
  color2 = BLUE;

  // Output the values of the variables
  cout << "Color 1: " << color1 << endl; // Output: 0
  cout << "Color 2: " << color2 << endl; // Output: 2

  // Switch statement with enum
  switch (color1) {
  case RED:
    cout << "Color 1 is Red" << endl;
    break;
  case GREEN:
    cout << "Color 1 is Green" << endl;
    break;
  case BLUE:
    cout << "Color 1 is Blue" << endl;
    break;
  default:
    cout << "Color 1 is not recognized" << endl;
  }

  return 0;
}
