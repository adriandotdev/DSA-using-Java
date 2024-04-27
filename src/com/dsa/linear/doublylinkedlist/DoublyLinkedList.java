package com.dsa.linear.doublylinkedlist;

public class DoublyLinkedList<T> {

    private Node<T> head;

    public void Insert(T data) {

        Node<T> newNode = new Node<>(data);

        if (this.head == null) {
            this.head = newNode;
            this.head.SetPrevious(null);
            this.head.SetNext(null);
            return;
        }

        Node<T> currentNode = this.head;

        while (currentNode.GetNext() != null) {

            currentNode = currentNode.GetNext();
        }

        currentNode.SetNext(newNode);
        newNode.SetPrevious(currentNode);
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
