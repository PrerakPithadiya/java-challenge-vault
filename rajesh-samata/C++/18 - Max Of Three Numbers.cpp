#include <iostream>
using namespace std;

class MaxFinder {
public:
    int findMax(int num1, int num2, int num3) {
        int maxNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        }

        if (num3 > maxNum) {
            maxNum = num3;
        }

        return maxNum;
    }
};

int main() {
    int num1, num2, num3;

    cout << "Enter three numbers: ";
    cin >> num1 >> num2 >> num3;

    MaxFinder maxObj;
    int maxNumber = maxObj.findMax(num1, num2, num3);

    cout << "Maximum of the three numbers is: " << maxNumber << endl;

    return 0;
}
