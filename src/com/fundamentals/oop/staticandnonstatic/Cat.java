package com.fundamentals.oop.staticandnonstatic;

public class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void meow() {
        // System.out.println(this.name); // Gives you an error that 'this' object cannot be used in static context.
        System.out.println("Meow");
    }
}
