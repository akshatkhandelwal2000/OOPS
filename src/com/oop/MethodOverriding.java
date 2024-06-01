package com.oop;

// Run-time Polymorphism
//Run-time polymorphism is achieved through method overriding.
// It is resolved during run time. Method overriding allows a subclass to
// provide a specific implementation of a method that is already defined in its superclass.
class ClassCar {
    public void displayInfo() {
        System.out.println("This is a Car");
    }
}

class Sedan1 extends ClassCar {
    @Override
    public void displayInfo() {
        System.out.println("This is a Sedan");
    }
}

class SUV1 extends ClassCar {
    @Override
    public void displayInfo() {
        System.out.println("This is a SUV");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ClassCar car1 = new ClassCar();
        ClassCar car2 = new Sedan1();
        ClassCar car3 = new SUV1();
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}
