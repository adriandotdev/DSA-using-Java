package com.dsa.linear.linkedlist;

public class Node<T> {

    private final T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void SetNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> GetNext() {
        return this.next;
    }

    public T GetData() {
        return this.data;
    }
}
