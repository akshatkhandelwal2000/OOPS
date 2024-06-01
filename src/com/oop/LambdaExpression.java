package com.oop;

import java.util.ArrayList;
import java.util.Collections;

class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Person2> list  = new ArrayList<>();
        list.add(new Person2("Ayaan", 98));
        list.add(new Person2("Akshat", 99));
        list.add(new Person2("Aryaman", 91));
        list.add(new Person2("Arsh", 93));
        list.add(new Person2("Anish", 92));

        Collections.sort(list, (p1,p2) -> Integer.compare(p1.age, p2.age));

        for(Person2 p : list) {
            System.out.println(p.name + " " + p.age);
        }
    }
}
