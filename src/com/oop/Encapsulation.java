package com.oop;

class Employee1 {
    // making variables private and accessing and setting their values by
    // using getter and setter helps us achieve encapsulation
    // encapsulation helps to hide data in single entity or unit to protect it from outside world
    private String name;
    private int id;

    public Employee1() {
        this.name = "Akshat";
        this.id = 1;
    }

    public Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Ak", 2);
        System.out.println(emp1.name + " "+ emp1.id);
        System.out.println(emp2.name + " " + emp2.id);
    }
}
