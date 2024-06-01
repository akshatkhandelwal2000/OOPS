package com.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Person1> {
    @Override
    public int compare(Person1 p1, Person1 p2) {
        return Integer.compare(p1.age, p2.age);
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        ArrayList<Person1> list  = new ArrayList<>();
        list.add(new Person1("Ayaan", 98));
        list.add(new Person1("Akshat", 99));
        list.add(new Person1("Aryaman", 91));
        list.add(new Person1("Arsh", 93));
        list.add(new Person1("Anish", 92));

        Collections.sort(list, new AgeComparator());


        for(Person1 p : list) {
            System.out.println(p.name + " " + p.age);
        }
    }
}
