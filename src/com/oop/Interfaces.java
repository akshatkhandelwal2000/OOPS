package com.oop;


// an interface is a reference type that is similar to a class
// and is used to specify a set of abstract methods that a class
// must implement. Interfaces are a fundamental aspect of Java's approach
// to multiple inheritance, providing a way to define methods that can be
// implemented by any class, from any inheritance tree. Here are the key points about interfaces


// An interface is defined using the interface keyword
// All methods in an interface are implicitly public and abstract (except for default and static methods)
interface Animal1 {

    //  Interfaces cannot have instance fields. All fields in an interface are implicitly public, static, and final
    int NUMBER_OF_LEGS = 4; // implicitly public, static, and final

    void makeSound();

    // Interfaces can contain default methods with a body. These methods provide
    // a default implementation and can be overridden by implementing classes
    default void sleep() {
        System.out.println("Sleeping");
    }


    //  Interfaces can also contain static methods with a body. These methods
    //  belong to the interface itself and cannot be overridden by implementing classes.
    static void info() {
        System.out.println("This is an animal Interface");
    }
}

interface Pet1 {
    void play();
}

// An interface with exactly one abstract method is called a functional interface
// and it can be used with lambda expressions and method references
// These interfaces are annotated with @FunctionalInterface
@FunctionalInterface
interface Greeting {
    void sayHello();
}



// A class that implements an interface must provide implementations for all of its abstract methods
// A class can implement multiple interfaces, which is Java's way of achieving multiple inheritance
// if there is a default method in interface it depends on class
// whether to override that method or not or can directly use from interface
class Dog1 implements Animal1, Pet1 {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void play() {
        System.out.println("Pet is Playing");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();

        dog.makeSound();
        dog.play();
        dog.sleep();
        Animal1.info();


        Greeting greeting = () -> System.out.println("Hello");
        greeting.sayHello();
    }
}

//    Key Points Recap:
//        Interfaces: Define a contract with abstract methods.
//        Implementation: Classes must implement all methods of the interface.
//        Multiple Inheritance: Achieved through implementing multiple interfaces.
//        Default Methods: Provide a default implementation.
//        Static Methods: Belong to the interface, not instances.
//        Functional Interfaces: Used with lambda expressions.


//Definition:
//
//        Defined using the interface keyword.
//        Methods are implicitly public and abstract.
//        Implementing an Interface:
//
//        Classes implement interfaces using the implements keyword.
//        Must provide implementations for all interface methods.
//        Multiple Interfaces:
//
//        A class can implement multiple interfaces, enabling multiple inheritance.
//        Default Methods:
//
//        Interfaces can have default methods with a body.
//        These methods can be overridden by implementing classes.
//        Static Methods:
//
//        Interfaces can include static methods with a body.
//        These methods belong to the interface itself and cannot be overridden.
//        No Instance Fields:
//
//        Interfaces cannot have instance fields.
//        Fields are implicitly public, static, and final.
//        Functional Interfaces:
//
//        An interface with exactly one abstract method.
//        Annotated with @FunctionalInterface.
//        Can be used with lambda expressions and method references.