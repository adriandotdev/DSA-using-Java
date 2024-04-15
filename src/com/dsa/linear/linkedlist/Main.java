package com.dsa.linear.linkedlist;

public class Main {

    public static void main(String[] args) {

      LinkedList<String> l = new LinkedList<>();

      l.Insert("Adrian Nads");
      l.Insert("Lenard");
      l.Insert("RC Khaye");
      l.Insert("Eric");
      l.Insert("Mikaela");

      System.out.println(l);
        l.Reverse(l.GetHead());
        System.out.println(l);
    }
}
