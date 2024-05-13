package com.dsa.linear.queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();

        System.out.println("Peek: " + q.Peek());
        System.out.println("Is Queue empty? " + q.IsEmpty());

        q.Enqueue(1);
        q.Enqueue(2);

        // Dequeue
        System.out.println(q.Dequeue());
        System.out.println(q);
        System.out.println("Is Queue empty? " + q.IsEmpty());
        System.out.println("Peek: " + q.Peek());
    }
}
