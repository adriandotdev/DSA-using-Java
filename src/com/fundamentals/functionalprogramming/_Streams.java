package com.fundamentals.functionalprogramming;
import java.util.List;

public class _Streams {
    public static void main(String[] args) {

        List<Integer> age = List.of(12, 23, 22, 56, 18, 17, 23, 17);

        age.stream().distinct().forEach(System.out::println);

        age.stream().map(a -> a - 1).filter(a -> a >= 18).forEach(System.out::println);
    }
}
