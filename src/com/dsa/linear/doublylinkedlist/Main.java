package com.dsa.linear.doublylinkedlist;

public class Main {

    public static void main(String[] args) {


        DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();

        dl.Insert(1);
        dl.Insert(2);
        dl.Insert(3);
        dl.Insert(4);
        dl.Insert(5);

        System.out.println(dl);

        dl.RemoveLast();

        System.out.println(dl);
    }
}
