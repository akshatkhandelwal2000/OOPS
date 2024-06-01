package com.oop;

// Multilevel inheritance involves a chain of inheritance where a class is
// derived from another class, which is also derived from another class.
class Car1 {
    String brand;
    String model;

    public Car1(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

}

class Sedan extends Car1 {
    int seatingCapacity;

    public Sedan(String brand, String model, int seatingCapacity) {
        super(brand, model);
        this.seatingCapacity = seatingCapacity;
    }

}

class LuxurySedan extends Sedan {
    boolean hasSunRoof;

    public LuxurySedan(String brand, String model, int seatingCapacity, boolean hasSunRoof) {
        super(brand, model, seatingCapacity);
        this.hasSunRoof = hasSunRoof;
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        LuxurySedan luxurySedan = new LuxurySedan("Mercedes", "S-Class", 5, true);
        // Sedan sedan = new Sedan("Merce", "A-Class", 5);
        System.out.println(luxurySedan.brand + " " + luxurySedan.model + " " + luxurySedan.seatingCapacity + " " + luxurySedan.hasSunRoof);
    }
}
