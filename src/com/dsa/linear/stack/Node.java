package com.dsa.linear.stack;

public class Node<T> {

    private T data;

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
