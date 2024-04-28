package com.dsa.linear.doublylinkedlist;

import com.interfaces.List;

public class DoublyLinkedList<T> implements List<T> {

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

    public void InsertAt(int index, T data) {

        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = this.head;

        if (index == 0) {
            this.head = newNode;
            this.head.SetNext(currentNode);
            currentNode.SetPrevious(this.head);
            return;
        }
    }

    @Override
    public void Remove(int index) {

    }

    @Override
    public int Size() {

        Node<T> currentNode = this.head;
        int size = 0;

        while (currentNode != null) {

            currentNode = currentNode.GetNext();
            size++;
        }

        return size;
    }

    @Override
    public void RemoveFirst() {

    }

    @Override
    public void RemoveLast() {

    }

    @Override
    public void Reverse() {

        if (this.Size() == 0) return;

        Node<T> currentNode = this.head;

        // 1<->2<->3
        while (currentNode.GetNext() != null) {

            currentNode = currentNode.GetNext();
        }

        this.head = currentNode;

        currentNode = this.head;

        while (currentNode != null) {

        }
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
