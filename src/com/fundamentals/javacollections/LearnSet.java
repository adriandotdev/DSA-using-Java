package com.fundamentals.javacollections;

import java.util.*;

public class LearnSet {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>(Comparator.naturalOrder());

        treeSet.add("Bailey");
        treeSet.add("Adrian");
        treeSet.add("Adi");

        System.out.println("LAST: " + treeSet.last());
        System.out.println("FIRST: " + treeSet.first());
        System.out.println("REVERSE ORDER: " + treeSet.descendingSet());
        System.out.println("POLL FIRST: " +  treeSet.pollFirst());
        System.out.println("POLL LAST: " + treeSet.pollLast());

        System.out.println("\nTREE SET:");
        for (String str : treeSet) {
            System.out.println(str);
        }

        Iterator<String> iterator = treeSet.iterator();

        System.out.println("\nITERATOR:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
