package com.fundamentals.others;
import java.util.ArrayList;
import java.util.List;

public class LearnGenerics {

    public static void main(String[] args) {

        GenericPrinter<Integer> printer = new GenericPrinter<>(12);
        printer.print();
        appendSomething("Hello", "World");
        appendSomething(1, "1");
        appendSomething(new Cat("Freddy", 9), "CAT");

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        printList(list);
    }

    // Generic method
    public static <T> void appendSomething(T data, String dataToAppend) {

        System.out.println(data + dataToAppend);
    }

    // Generic method with wildcards
    public static void printList(List<?> list) {

        System.out.println(list);
    }
}
