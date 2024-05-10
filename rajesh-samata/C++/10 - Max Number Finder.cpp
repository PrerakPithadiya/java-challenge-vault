#include <iostream>
using namespace std;

class MaxFinder {
private:
    int num1, num2, num3;

public:
    MaxFinder(int a, int b, int c) {
        num1 = a;
        num2 = b;
        num3 = c;
    }

    int findMax() {
        int maxNum = num1;
        if (num2 > maxNum)
            maxNum = num2;
        if (num3 > maxNum)
            maxNum = num3;
        return maxNum;
    }
};

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    MaxFinder maxObj(a, b, c);

    int maxNumber = maxObj.findMax();

    cout << "Maximum number among " << a << ", " << b << ", and " << c << " is: " << maxNumber << endl;

    return 0;
}
