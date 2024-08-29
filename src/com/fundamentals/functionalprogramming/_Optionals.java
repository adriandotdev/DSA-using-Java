package com.fundamentals.functionalprogramming;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {

        record Person(String name, int age) {}

        Optional<Person> optionalPerson = Optional.of(new Person("Sarah", 23));

        Optional<Person> result = optionalPerson.filter(person -> person.age == 23);

        result.ifPresent(System.out::println);

        optionalPerson.orElseThrow(() -> new RuntimeException("Hello"));
    }
}
