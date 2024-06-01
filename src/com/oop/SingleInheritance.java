package com.oop;

class Car {
    int topSpeed;
    int doors;

    public Car() {
        System.out.println("Base Class Constructor");
    }


    // Constructor of super class
    public Car(int topSpeed, int doors) {
        this.topSpeed = topSpeed;
        this.doors = doors;
    }


    public void Tyres() {
        System.out.println("Tyres");
    }

    public void Color() {
        System.out.println("Color");
    }

}

class Audi extends Car {
    String modelType;

    public Audi() {
        System.out.println("Child Class Constructor");
    }


    // Constructor of child class
    public Audi(int topSpeed, int doors, String modelType) {
        // super keyword refers to super class
        // If we want to call a parameterized constructor of the base class, then we can call it using super()
        // The point to note is base class constructor call must be the first line in the derived class constructor
        super(topSpeed, doors);
        this.modelType = modelType;
    }

    public void ModelName() {
        System.out.println("Audi Q7");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        // Here first superclass constructor will be called thereafter derived(sub-class) constructor will be called
        // because the constructor call is from top to bottom
        Audi audi1 = new Audi(); // Creating object of child class

        // creating object of parent class
        Car car = new Car(); // only parent class constructor will  be called


        audi1.ModelName(); // can access Parent class methods and variables as well but parent class cannot child class methods
        audi1.Color();

        Audi audi2 = new Audi(300, 2, "SUV");
        System.out.println(audi2.topSpeed + " " + audi2.doors + " " + audi2.modelType);
    }
}


// In Java, constructor of the base class with no argument gets automatically called in the derived class constructor.


// Base class Animal
//public class Animal {
//    public String name;
//    public int age;
//
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//
//// Subclass Dog inheriting Animal
//public class Dog extends Animal {
//    public String breed;
//
//    public Dog(String name, int age, String breed) {
//        super(name, age);
//        this.breed = breed;
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//}
//
//// Main class to demonstrate inheritance
//public class MainInheritance {
//    public static void main(String[] args) {
//        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
//        System.out.println("Dog Name: " + dog.getName());
//        System.out.println("Dog Age: " + dog.getAge());
//        System.out.println("Dog Breed: " + dog.getBreed());
//    }
//}

