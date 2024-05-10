class Animal {
    // Method to make sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Dog) inherits from Animal
class Dog extends Animal {
    // Override method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class (Cat) inherits from Animal
class Cat extends Animal {
    // Override method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal;

        // Reference to Dog object
        animal = new Dog();
        animal.makeSound(); // Calls Dog's makeSound()

        // Reference to Cat object
        animal = new Cat();
        animal.makeSound(); // Calls Cat's makeSound()
    }
}
