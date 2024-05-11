#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    int studentID;
    string studentName;
    int marks[3];

public:
    void getData() {
        cout << "Enter student ID: ";
        cin >> studentID;
        cin.ignore(); // Ignore newline character in buffer
        cout << "Enter student name: ";
        getline(cin, studentName);
        cout << "Enter marks for 3 subjects: ";
        for (int i = 0; i < 3; ++i) {
            cin >> marks[i];
        }
    }

    void putData() {
        cout << "Student ID: " << studentID << endl;
        cout << "Student Name: " << studentName << endl;
        cout << "Marks for 3 subjects: ";
        for (int i = 0; i < 3; ++i) {
            cout << marks[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    Student student1;

    cout << "Enter student details:" << endl;
    student1.getData();

    cout << "\nStudent Information:" << endl;
    student1.putData();

    return 0;
}
