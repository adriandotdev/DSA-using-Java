package com.dsa.linear.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();


        l.Insert("1");
        l.Insert("2");
//        l.Insert("3");
//        l.Insert("4");
//
//        l.Insert("5");
//        l.Insert("6");
//        l.Insert("7");
//        l.Insert("8");

//        System.out.println(l);
//        l.RemoveLast();
        System.out.println(l);
        l.Reverse(l.GetHead());
        System.out.println(l);
    }
}
