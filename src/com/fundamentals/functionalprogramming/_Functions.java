package com.fundamentals.functionalprogramming;

import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {

        System.out.println(doubleTheAge.apply(23));
        System.out.println(doubleTheAge.andThen(addOne).apply(23));
        System.out.println(doubleTheAge.compose(addOne).apply(23));
    }

    public static Function<Integer, Integer> addOne = age -> age + 1;
    public static Function<Integer, Integer> doubleTheAge = age -> age * 2;
}
