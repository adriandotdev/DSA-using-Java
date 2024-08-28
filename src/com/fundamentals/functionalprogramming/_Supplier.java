package com.fundamentals.functionalprogramming;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(configs.get());
    }
    static Supplier<List<String>> configs = () -> List.of("config1", "config2");
}
