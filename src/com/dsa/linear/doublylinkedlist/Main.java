package com.dsa.linear.doublylinkedlist;

public class Main {

    public static void main(String[] args) {


        DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();

        dl.Insert(1);
        dl.Insert(2);
        dl.InsertAt(0, 55);

        System.out.println(dl);

        dl.Reverse();

        System.out.println(dl);
    }
}