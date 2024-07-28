package com.fundamentals.oop.staticandnonstatic;

public class StaticAndNonStatic {

    public static void main(String[] args) {
        var cat1 = new Cat("Eli", 1);

        cat1.meow(); // Gives you a warning that an instance is calling a static method.
        Cat.meow(); // Proper way
    }
}
