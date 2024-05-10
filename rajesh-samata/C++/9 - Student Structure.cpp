#include <iostream>
#include <string>
using namespace std;

struct Student {
    int studentId;
    string studentName;
    int marks[3];

    void getData() {
        cout << "Enter student ID: ";
        cin >> studentId;
        
        cout << "Enter student name: ";
        cin.ignore();
        getline(cin, studentName);
        
        cout << "Enter marks for 3 subjects:" << endl;
        for (int i = 0; i < 3; ++i) {
            cout << "Subject " << i + 1 << ": ";
            cin >> marks[i];
        }
    }

    void putData() {
        cout << "Student ID: " << studentId << endl;
        cout << "Student Name: " << studentName << endl;
        cout << "Marks for 3 subjects:" << endl;
        for (int i = 0; i < 3; ++i) {
            cout << "Subject " << i + 1 << ": " << marks[i] << endl;
        }
    }
};

int main() {
    Student student1;
    
    cout << "Enter details for student:" << endl;
    student1.getData();
    
    cout << "\nDetails of student:" << endl;
    student1.putData();

    return 0;
}
