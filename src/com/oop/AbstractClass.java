package com.oop;


// In Java, an abstract class is a class that cannot be instantiated on
// its own and is meant to be subclassed. It serves as a blueprint f
// or other classes. Here are the key points about abstract classes
// Any class that contains one or more abstract methods must also be declared abstract
// Although you cannot instantiate an abstract class
// We can have an abstract class without any abstract method
abstract class Animal {
    // Abstract method (no implementation)
    public abstract void makeSound();


    // it can have constructors, which can be called when a subclass is instantiated.
    public Animal() {
        System.out.println("An animal is created");
    }


    // We can define static methods in an abstract class
    static void Eat() {

    }

    // Concrete method (implementation provided)
    public void Sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public Dog() {
        super(); // Calls the constructor of Animal
        System.out.println("A dog is created");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.Sleep();
    }
}

//    Characteristics of Java Abstract Keyword
//        In Java, the abstract keyword is used to define abstract classes and methods. Here are some of its key characteristics:
//
//        Abstract classes cannot be instantiated: An abstract class is a class that cannot be instantiated directly. Instead, it is meant to be extended by other classes, which can provide concrete implementations of its abstract methods.
//        Abstract methods do not have a body: An abstract method is a method that does not have an implementation. It is declared using the abstract keyword and ends with a semicolon instead of a method body. Subclasses of an abstract class must provide a concrete implementation of all abstract methods defined in the parent class.
//        Abstract classes can have both abstract and concrete methods: Abstract classes can contain both abstract and concrete methods. Concrete methods are implemented in the abstract class itself and can be used by both the abstract class and its subclasses.
//        Abstract classes can have constructors: Abstract classes can have constructors, which are used to initialize instance variables and perform other initialization tasks. However, because abstract classes cannot be instantiated directly, their constructors are typically called constructors in concrete subclasses.
//        Abstract classes can contain instance variables: Abstract classes can contain instance variables, which can be used by both the abstract class and its subclasses. Subclasses can access these variables directly, just like any other instance variables.
//        Abstract classes can implement interfaces: Abstract classes can implement interfaces, which define a set of methods that must be implemented by any class that implements the interface. In this case, the abstract class must provide concrete implementations of all methods defined in the interface.
