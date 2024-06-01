package com.oop;

    // A static method can call only other static methods and cannot call a non-static method from it.
    // A static method can be accessed directly by the class name and doesn’t need any object
    // A static method cannot refer to "this" or "super" keywords in anyway

class StaticExample {
    // Static variable: shared among all instances of the class
    // When a member is declared static, it can be accessed before any objects of its class are created,
    // and without reference to any object. You can declare both methods and variables to be static.
    // The most common example of a static member is main( ).
    // main( ) is declared as static because it must be called before any objects exist.
    // Static method in Java is a method which belongs to the class and not to the object.
    // A static method can access only static data.
    static String name;

    // Instance variable: each instance of the class has its own copy
    int age;


    // Instance method: requires an instance of the class to be called
    public void greeting() {
        System.out.println("Greeting you");
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        StaticExample static1 = new StaticExample();
        StaticExample static2 = new StaticExample();

        static1.name = "Akshat";
        static2.greeting();
    }
}

// The static keyword in Java is used for memory management primarily. It can be applied to
// variables, methods, blocks, and nested classes. Let's see an example that includes static variables, methods, and blocks.


//    Key Uses of static:
//        Static Variables:
//
//        Also known as class variables.
//        Shared among all instances of the class.
//        Memory allocation happens once when the class is loaded.
//        Static Methods:
//
//        Can be called without creating an instance of the class.
//        Can access static variables and other static methods directly.
//        Cannot access instance variables or instance methods directly.
//        Static Blocks:
//
//        Used for static initializations of a class.
//        Runs once when the class is loaded into memory.
//        Static Nested Classes:
//
//        A static class within another class.
//        Can access all static members of the outer class.




//public class StaticExample {
//    //
//    //    // Static variable: shared among all instances of the class
//    //    static int staticCounter = 0;
//    //
//    //    // Instance variable: each instance of the class has its own copy
//    int instanceCounter = 0;
//
//    // Static block: executed when the class is loaded
//    static {
//        System.out.println("Static block executed.");
//        // Initializing the static variable
//        staticCounter = 10;
//    }
//
//    // Constructor: executed when an instance of the class is created
//    public StaticExample() {
//        // Increment the instance counter
//        instanceCounter++;
//        // Increment the static counter
//        staticCounter++;
//    }
//
//    // Static method: can be called without creating an instance of the class
//    public static void displayStaticCounter() {
//        System.out.println("Static Counter: " + staticCounter);
//        // Static methods cannot access instance variables directly
//        // System.out.println("Instance Counter: " + instanceCounter); // This would cause an error
//    }
//
//    // Instance method: requires an instance of the class to be called
//    public void displayInstanceCounter() {
//        System.out.println("Instance Counter: " + instanceCounter);
//    }
//
//    // Static nested class: can access static members of the outer class
//    static class StaticNestedClass {
//        void display() {
//            System.out.println("Accessing static counter from static nested class: " + staticCounter);
//        }
//    }
//
//    // Main method: entry point of the program
//    public static void main(String[] args) {
//        // Accessing the static method without creating an instance of the class
//        StaticExample.displayStaticCounter();
//
//        // Creating first instance of StaticExample
//        StaticExample example1 = new StaticExample();
//        // Display counters for example1
//        example1.displayInstanceCounter();
//        StaticExample.displayStaticCounter();
//
//        // Creating second instance of StaticExample
//        StaticExample example2 = new StaticExample();
//        // Display counters for example2
//        example2.displayInstanceCounter();
//        StaticExample.displayStaticCounter();
//
//        // Accessing the static variable directly using the class name
//        System.out.println("Accessing static variable directly: " + StaticExample.staticCounter);
//
//        // Accessing the instance variable directly (not recommended)
//        System.out.println("Accessing instance variable directly: " + example1.instanceCounter);
//
//        // Using the static nested class
//        StaticExample.StaticNestedClass nestedObject = new StaticExample.StaticNestedClass();
//        nestedObject.display();
//    }
//}



//Explanation:
//        Static Variable:
//
//static int staticCounter: A variable shared among all instances of the class. It gets memory only once when the class is loaded.
//        Instance Variable:
//
//        int instanceCounter: Each instance of the class has its own copy of this variable.
//        Static Block:
//
//static { ... }: Executed once when the class is loaded into memory. It's useful for initializing static variables.
//        Constructor:
//
//public StaticExample() { ... }: Called whenever a new instance is created. It increments both instance and static counters.
//        Static Method:
//
//public static void displayStaticCounter() { ... }: Can be called without an instance. It can access static variables but not instance variables.
//        Instance Method:
//
//public void displayInstanceCounter() { ... }: Can access both static and instance variables.
//        Static Nested Class:
//
//static class StaticNestedClass { ... }: A nested class that can access static members of the outer class.
//        Main Method:
//
//public static void main(String[] args) { ... }: Demonstrates accessing static and instance members, and using the static nested class.
