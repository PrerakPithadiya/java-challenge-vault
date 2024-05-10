#include <iostream>
using namespace std;

class SimpleInterestCalculator {
private:
    double principal;
    double rate;
    int time;

public:
    // Constructor to initialize data members
    SimpleInterestCalculator(double p, double r, int t) : principal(p), rate(r), time(t) {}

    // Function to calculate simple interest
    double calculateSimpleInterest() {
        return (principal * rate * time) / 100.0;
    }
};

int main() {
    double principalAmount, rateOfInterest;
    int timePeriod;

    // Input principal amount, rate of interest, and time period
    cout << "Enter principal amount: ";
    cin >> principalAmount;
    cout << "Enter rate of interest (in percentage): ";
    cin >> rateOfInterest;
    cout << "Enter time period (in years): ";
    cin >> timePeriod;

    // Create object of SimpleInterestCalculator class
    SimpleInterestCalculator siCalculator(principalAmount, rateOfInterest, timePeriod);

    // Calculate simple interest
    double simpleInterest = siCalculator.calculateSimpleInterest();

    // Output the result
    cout << "Simple Interest: " << simpleInterest << endl;

    return 0;
}
