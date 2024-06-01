package com.oop;


// Compile-time Polymorphism
//Compile-time polymorphism is achieved through method overloading.
// It is resolved during compile time. Method overloading allows multiple
// methods with the same name but different parameters to exist in the same class.
class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}


public class MethodOverLoading {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3, 4));
        System.out.println(calc.add(2.0, 3.0));
    }
}
