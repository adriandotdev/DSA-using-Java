package com.dsa.linear.doublylinkedlist;

public class Node <T> {

    private T data;
    private Node<T> next;
    private Node<T> previous;

    public Node(T data) {
        this.data = data;
    }

    public T GetData() {
        return this.data;
    }

    public Node<T> GetNext() {
        return this.next;
    }

    public Node<T> GetPrevious() {
        return this.previous;
    }

    public void SetNext(Node<T> next) {
        this.next = next;
    }

    public void SetPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
