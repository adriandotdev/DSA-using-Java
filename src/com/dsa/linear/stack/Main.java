package com.dsa.linear.stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.Push(1);
        s.Push(2);
        s.Push(3);
        System.out.println(s.Size());
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.Size());
        System.out.println(s);
    }
}
