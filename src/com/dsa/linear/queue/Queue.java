package com.dsa.linear.queue;

public class Queue<T> {

    private Node<T> head;

    public void Enqueue(T data) {

        Node<T> newNode = new Node<>(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node<T> currentNode = this.head;

        while (currentNode.GetNext() != null) {
            currentNode = currentNode.GetNext();
        }

        currentNode.SetNext(newNode);
    }

    public T Dequeue() {

        final T data;

        if (this.head == null) return null;

        data = this.head.GetData();
        this.head = this.head.GetNext();

        return data;
    }

    public boolean IsEmpty() {
        return this.head == null;
    }

    public T Peek() {
        if (this.head == null) return null;

        return this.head.GetData();
    }

    @Override
    public String toString() {
        if (this.head == null) return "[]";

        Node<T> currentNode = this.head;
        String data = "";

        while (currentNode != null) {

            data += currentNode.GetData().toString() + ", ";

            currentNode = currentNode.GetNext();
        }

        return "[ " + data.substring(0, data.length() - 2) + " ]";
    }
}
