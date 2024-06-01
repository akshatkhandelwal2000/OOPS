package com.oop;

// Hierarchical inheritance involves multiple classes inheriting from the same base class.
class Car2 {
    String brand;
    String model;

    public Car2(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

}

class SUV extends Car2 {
    boolean isFourWheelDrive;

    public SUV(String brand, String model, boolean isFourWheelDrive) {
        super(brand, model);
        this.isFourWheelDrive = isFourWheelDrive;
    }

}

class SportsCar extends Car2 {
    int topSpeed;

    public SportsCar(String brand, String model, int topSpeed) {
        super(brand, model);
        this.topSpeed = topSpeed;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        SUV suv = new SUV("Toyota", "Cruiser", true);

        SportsCar sportsCar = new SportsCar("Ferrari", "488", 330);

        System.out.println(suv.brand + " " + suv.model + " " + suv.isFourWheelDrive);

        System.out.println(sportsCar.brand + " " + sportsCar.model + " " + sportsCar.topSpeed);
    }
}
