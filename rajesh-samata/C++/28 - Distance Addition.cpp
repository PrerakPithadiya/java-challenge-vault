#include <iostream>
using namespace std;

// Class representing a distance with feet and inches
class Distance {
private:
    int feet;
    int inches;

public:
    // Constructor to initialize feet and inches
    Distance(int f = 0, int i = 0) : feet(f), inches(i) {}

    // Function to add two distances
    void addDistance(Distance d1, Distance d2) {
        inches = d1.inches + d2.inches;
        feet = d1.feet + d2.feet + (inches / 12);
        inches %= 12;
    }

    // Function to display the distance
    void display() {
        cout << "Distance: " << feet << " feet " << inches << " inches" << endl;
    }
};

int main() {
    // Create two Distance objects
    Distance dist1(3, 8);
    Distance dist2(2, 10);

    // Create another Distance object to store the sum
    Distance sum;

    // Add the distances using the addDistance() function
    sum.addDistance(dist1, dist2);

    // Display the sum
    cout << "Sum of distances:" << endl;
    sum.display();

    return 0;
}
