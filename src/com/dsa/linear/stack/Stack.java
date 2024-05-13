package com.dsa.linear.stack;

public class Stack<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void Push(T data) {

        if (this.head == null) {

            this.head = new Node<>(data);
            this.tail = head;
            this.size++;
            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = this.head;

        while (currentNode.GetNext() != null) {

            currentNode = currentNode.GetNext();
        }

        currentNode.SetNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public T Pop() {

        if (this.head == null) throw new Error("Stack is empty");

        Node<T> nodeToPop = null;

        if (this.head == this.tail) {
            T dataToPop = this.head.GetData();
            this.head = null;
            this.tail = null;
            this.size--;
            return dataToPop;
        }
        Node<T> currentNode = this.head;

        while(currentNode.GetNext() != this.tail) {

            currentNode = currentNode.GetNext();
        }

        nodeToPop = currentNode.GetNext();
        currentNode.SetNext(null);
        this.tail = currentNode;
        this.size--;
        return nodeToPop.GetData();
    }

    public boolean IsEmpty() {
        return this.head == null;
    }

    public T Peek() {

        if (this.head == null) {
            throw new Error("Stack is empty");
        }

        return this.tail.GetData();
    }

    public int Size() {

       return this.size;
    }

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
