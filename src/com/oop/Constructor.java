package com.oop;

 class Employee {
     // instance variable
     // Objects gets initialized by default with null
     // and primitive data type gets like int, double gets initialized with 0 and 0.0
     String name;
     int id;

     // Any class will have a default constructor, does not matter if we declare it in the class or not.
     // constructor does not have any return type in java not even void
     // This is because the implicit return type of a class’ constructor is the class type itself.
    public Employee() {
        this.name = "Akshat";
        this.id = 1;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // new is used to create new object using constructors
        Employee emp2 = new Employee("Ak", 2);
        System.out.println(emp1.name + " "+ emp1.id);
        System.out.println(emp2.name + " " + emp2.id);
    }
}
