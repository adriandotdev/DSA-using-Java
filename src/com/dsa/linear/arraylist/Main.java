package com.dsa.linear.arraylist;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        l.Insert(1);
        l.Insert(2);
        l.Insert(3);
        l.Insert(4);
        l.Insert(5);
        l.Insert(6);
        l.Insert(7);
        l.Insert(8);
        l.Insert(9);
        l.Insert(10);
//        l.InsertAt(9, 55);
        l.Insert(11);
        l.RemoveLast();

        System.out.println(l);
    }
}
