package com.fundamentals.functionalprogramming;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

      printName.accept("Adrian");
    }
    static Consumer<String> printName = System.out::println;
}
