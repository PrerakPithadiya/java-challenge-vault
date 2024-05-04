package Rajesh_Sir_Problems;

// Abstract class representing an animal
abstract class Animal {
    // Abstract methods for eating and sleeping behaviors
    public abstract void eat();

    public abstract void sleep();
}

// Concrete class representing a lion
class Lion extends Animal {
    // Implementation of the eat behavior for a lion
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    // Implementation of the sleep behavior for a lion
    public void sleep() {
        System.out.println("The lion sleeps in a den.");
    }
}

// Concrete class representing a tiger
class Tiger extends Animal {
    // Implementation of the eat behavior for a tiger
    public void eat() {
        System.out.println("The tiger eats other animals.");
    }

    // Implementation of the sleep behavior for a tiger
    public void sleep() {
        System.out.println("The tiger sleeps under trees.");
    }
}

// Concrete class representing a deer
class Deer extends Animal {
    // Implementation of the eat behavior for a deer
    public void eat() {
        System.out.println("The deer eats grass.");
    }

    // Implementation of the sleep behavior for a deer
    public void sleep() {
        System.out.println("The deer sleeps in forests.");
    }
}

// Main class to test the Animal hierarchy
class AnimalTest {
    public static void main(String[] args) {
        // Create instances of different animals
        Animal animal;

        // Test lion
        animal = new Lion();
        System.out.println("Lion:");
        animal.eat();
        animal.sleep();

        // Test tiger
        animal = new Tiger();
        System.out.println("\nTiger:");
        animal.eat();
        animal.sleep();

        // Test deer
        animal = new Deer();
        System.out.println("\nDeer:");
        animal.eat();
        animal.sleep();
    }
}