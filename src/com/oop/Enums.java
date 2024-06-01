package com.oop;

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class Enums {
    public static void main(String[] args) {

        Month month = Month.JANUARY;
        // System.out.println(month);

        // iterate over enum values
        for(Month m : Month.values()) {
            System.out.println(m);
        }
    }
}
