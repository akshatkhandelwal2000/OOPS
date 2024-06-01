package com.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee1 encap = new Employee1();
        encap.setName("Akshat Khandelwal");
        encap.setId(3);
        System.out.println(encap.getName() + " " + encap.getId());


        Employee1 encap1 = new Employee1("Akshat", 4);
        System.out.println(encap1.getName() + " " + encap1.getId());
    }
}
