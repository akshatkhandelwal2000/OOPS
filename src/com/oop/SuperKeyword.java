package com.oop;

class Person {
    Person() {
        System.out.println("Person Class Constructor");
    }
}

     // super is used to call a superclass constructor
     // super is used to call a superclass method
     // super is used to access a superclass field
     // super must be the first statement in a constructor


class Student extends Person {
    Student() {
        super();
        System.out.println("Student class Constructor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        //System.out.println();
    }
}


//    In Java, the super keyword is primarily used in the context of inheritance to refer to members (constructors, methods, and variables) of the superclass from a subclass. Here are its key uses explained briefly:
//
//        Uses of super:
//        Calling Superclass Constructor:
//
//        The super keyword is used to call the constructor of the superclass from the subclass constructor. This ensures that the superclass is properly initialized when a subclass object is created.
//        Syntax: super(arguments);
//        Accessing Superclass Methods:
//
//        The super keyword is used to call a method defined in the superclass that has been overridden by the subclass. This allows the subclass to invoke the original behavior of the superclass method.
//        Syntax: super.methodName(arguments);
//        Accessing Superclass Variables:
//
//        The super keyword is used to access a field (variable) in the superclass if it is hidden by a field of the same name in the subclass.
//        Syntax: super.variableName;
//        Example:
//        Here is a simple example illustrating the use of super:


//// Superclass
//class Animal {
//    String name;
//
//    // Superclass constructor
//    Animal(String name) {
//        this.name = name;
//    }
//
//    // Superclass method
//    void makeSound() {
//        System.out.println("Animal makes a sound");
//    }
//}
//
//// Subclass
//class Dog extends Animal {
//    String name;
//
//    // Subclass constructor
//    Dog(String name) {
//        // Calling the superclass constructor
//        super(name);
//        this.name = name;
//    }
//
//    // Overriding the superclass method
//    @Override
//    void makeSound() {
//        // Calling the superclass method
//        super.makeSound();
//        System.out.println("Dog barks");
//    }
//
//    // Method to display names
//    void displayNames() {
//        // Accessing the superclass variable
//        System.out.println("Superclass name: " + super.name);
//        // Accessing the subclass variable
//        System.out.println("Subclass name: " + this.name);
//    }
//}
//
//// Main class
//public class SuperExample {
//    public static void main(String[] args) {
//        // Creating an instance of Dog
//        Dog dog = new Dog("Buddy");
//
//        // Calling the overridden method
//        dog.makeSound();
//
//        // Displaying names
//        dog.displayNames();
//    }
//}

