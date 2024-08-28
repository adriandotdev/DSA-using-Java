package com.fundamentals.functionalprogramming;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isLegalAge.test(18));
        System.out.println(isLegalAge.test(17));
        System.out.println(isLegalAge.and(isLegalToDrink).test(18));
        System.out.println(isLegalAge.and(isLegalToDrink).test(28));
    }
    static Predicate<Integer> isLegalAge = age -> age >= 18;
    static Predicate<Integer> isLegalToDrink = age ->  age >= 21;
}
