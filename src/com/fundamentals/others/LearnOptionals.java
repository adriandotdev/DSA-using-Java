package com.fundamentals.others;

import java.util.NoSuchElementException;
import java.util.Optional;

public class LearnOptionals {

    public static void main(String[] args) {

        Optional<Cat> myCat = findCatByName("Freddy");

        Cat cat = myCat.orElseThrow(() -> new NoSuchElementException("ELEMENT_NOT_FOUND"));
        System.out.println(cat.name);
    }

    public static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);

        if (cat == null) {
            return Optional.ofNullable(null);
        }

        return Optional.of(cat);
    }
}
