package com.fundamentals.javacollections;

import java.util.*;

public class LearnList {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        List<String> stack = new Stack<>();
        List<String> vector = new Vector<>();

        linkedList.add("L1");
        arrayList.add("A1");
        stack.add("S1");
        vector.add("V1");

        System.out.println("Linked List: " + linkedList);
        System.out.println("Array List: " + arrayList);
        System.out.println("Stack: " + stack);
        System.out.println("Vector: " + vector);
    }
}
