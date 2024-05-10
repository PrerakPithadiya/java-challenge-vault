// Base class for single inheritance
class Parent {
    void displayParent() {
        System.out.println("Parent class method");
    }
}

// Derived class for single inheritance
class Child extends Parent {
    void displayChild() {
        System.out.println("Child class method");
    }
}

// Base class for multilevel inheritance
class Grandparent {
    void displayGrandparent() {
        System.out.println("Grandparent class method");
    }
}

// Intermediate class for multilevel inheritance
class Parent2 extends Grandparent {
    void displayParent() {
        System.out.println("Parent2 class method");
    }
}

// Derived class for multilevel inheritance
class Grandchild extends Parent2 {
    void displayGrandchild() {
        System.out.println("Grandchild class method");
    }
}

// Base class 1 for multiple inheritance
class Base1 {
    void displayBase1() {
        System.out.println("Base1 class method");
    }
}

// Base class 2 for multiple inheritance
class Base2 {
    void displayBase2() {
        System.out.println("Base2 class method");
    }
}

// Derived class for multiple inheritance
class Derived extends Base1 {
    void displayDerived() {
        System.out.println("Derived class method");
    }
}

// Derived class for hierarchical inheritance
class Child1 extends Base1 {
    void displayChild1() {
        System.out.println("Child1 class method");
    }
}

// Derived class for hierarchical inheritance
class Child2 extends Base1 {
    void displayChild2() {
        System.out.println("Child2 class method");
    }
}

public class Main {
    public static void main(String[] args) {
        // Single inheritance
        Child obj1 = new Child();
        obj1.displayParent();
        obj1.displayChild();
        
        // Multilevel inheritance
        Grandchild obj2 = new Grandchild();
        obj2.displayGrandparent();
        obj2.displayParent();
        obj2.displayGrandchild();
        
        // Multiple inheritance (using interface)
        Derived obj3 = new Derived();
        obj3.displayBase1();
        obj3.displayDerived();
        
        // Hierarchical inheritance
        Child1 obj4 = new Child1();
        obj4.displayBase1();
        obj4.displayChild1();
        
        Child2 obj5 = new Child2();
        obj5.displayBase1();
        obj5.displayChild2();
    }
}
