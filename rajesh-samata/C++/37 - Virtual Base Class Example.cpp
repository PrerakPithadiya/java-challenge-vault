#include <iostream>
using namespace std;

// Base class
class Animal {
public:
    void eat() {
        cout << "Animal eats" << endl;
    }
};

// Derived class 1
class Dog : virtual public Animal {
public:
    void bark() {
        cout << "Dog barks" << endl;
    }
};

// Derived class 2
class Cat : virtual public Animal {
public:
    void meow() {
        cout << "Cat meows" << endl;
    }
};

// Derived class 3
class DogCat : public Dog, public Cat {
public:
    void play() {
        cout << "DogCat plays" << endl;
    }
};

int main() {
    DogCat dc;
    dc.eat(); // Accessing eat() from Animal
    dc.bark(); // Accessing bark() from Dog
    dc.meow(); // Accessing meow() from Cat
    dc.play(); // Accessing play() from DogCat

    return 0;
}
