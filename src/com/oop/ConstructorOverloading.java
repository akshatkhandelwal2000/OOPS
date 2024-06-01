package com.oop;

class Human {
    // instance variable
    // Objects gets initialized by default with null
    // and primitive data type gets like int, double gets initialized with 0 and 0.0
    String gender;
    int age;
    double height;

    // Any class will have a default constructor, does not matter if we declare it in the class or not.
    // constructor does not have any return type in java not even void
    // This is because the implicit return type of a class’ constructor is the class type itself.
    // there can be many constructors created for any class but their parameters should be different
    // this is called constructor overloading
    // Any class will have a default constructor, does not matter if we declare it in the class or not
    // Once defined, the constructor is automatically called when the object is created
    public Human() {

    }


    public Human(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public Human(String gender, int age, double height) {
        // In Java, ‘this’ is a reference variable that refers to the current object, or can be said “this”
        // in Java is a keyword that refers to the current object instance. It can be used to call current class methods
        // and fields, to pass an instance of the current class as a parameter, and to differentiate
        // between the local and instance variables. Using “this” reference can improve code readability and reduce naming conflicts.
        this.gender = gender;
        this.age = age;
        this.height = height;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Human human1 = new Human(); // default constructor having no parameter
        Human human2 = new Human("Male", 22); // object will be created using constructor having 2 params
        Human human3  = new Human("Male", 22, 6.0); // object will be created using constructor having 3 params
        System.out.println(human1.gender + " "+ human1.age + " " + human1.height);
        System.out.println(human2.gender + " "+ human2.age);
        System.out.println(human3.gender + " "+ human3.age + " " + human3.height);
    }
}




//    Inheritance and constructors in Java:
//
//        In Java, constructor of base class with no argument gets automatically called in derived class constructor.
//        For example, output of following program given below is:
//
//        Base Class Constructor Called
//        Derived Class Constructor Called
//
//// filename: Main.java
//class Base {
//    Base() {
//        System.out.println("Base Class Constructor Called ");
//    }
//}
//
//class Derived extends Base {
//    Derived() {
//        System.out.println("Derived Class Constructor Called ");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Derived d = new Derived();
//    }
//}
