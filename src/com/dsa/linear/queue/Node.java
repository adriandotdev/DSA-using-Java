package com.dsa.linear.queue;

public class Node<T> {

    private Node<T> next;
    private T data;

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
