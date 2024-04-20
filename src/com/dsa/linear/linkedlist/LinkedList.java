package com.dsa.linear.linkedlist;

import com.interfaces.List;

public class LinkedList<T> implements List<T> {

    private Node<T> head;

    public void Insert(T data) {

        if (this.head == null) {
            this.head = new Node<T>(data);
            return;
        }

        Node<T> currentNode = this.head;
        Node<T> newNode = new Node<>(data);

        while (currentNode.GetNext() != null) {

            currentNode = currentNode.GetNext();
        }

        currentNode.SetNext(newNode);
    }

    public void InsertAt(int index, T data) {

        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = this.head;

        int counter = 0;

        if (index == 0) {

            this.head = newNode;
            this.head.SetNext(currentNode);
            return;
        }

        if (index >= this.Size()) throw new IndexOutOfBoundsException("Invalid index for insertion");

        while (currentNode != null) {

            if (counter == index - 1) {

                Node<T> nextNode = currentNode.GetNext();

                currentNode.SetNext(newNode);
                newNode.SetNext(nextNode);
            }

            currentNode = currentNode.GetNext();
            counter++;
        }
    }

    public void Remove(int index) {

        if (index >= this.Size()) throw new IndexOutOfBoundsException();

        if (index == 0) {
            this.head = this.head.GetNext();
            return;
        }

        Node<T> currentNode = this.head;
        int counter = 0;

        while (currentNode != null) {

            currentNode = currentNode.GetNext();
            counter++;

            if (counter == index - 1) {

                currentNode.SetNext(currentNode.GetNext().GetNext());
                return;
            }
        }
    }

    public int Size() {

        if (this.head == null) return 0;

        Node<T> currentNode = this.head;

        int size = 0;

        while(currentNode != null) {

            currentNode = currentNode.GetNext();
            size++;
        }

        return size;
    }

    @Override
    public void RemoveFirst() {

        if (this.Size() == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (this.Size() == 1) {
            this.head = null;
            return;
        }

        this.head = this.head.GetNext();
    }

    @Override
    public void RemoveLast() {

        if (this.Size() == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (this.Size() == 1) {
            this.head = null;
            return;
        }

        Node<T> currentNode = this.head;
        Node<T> nextNode = this.head.GetNext();
        // 1 2 3
        while(nextNode.GetNext() != null) {

            currentNode = nextNode;
            nextNode = currentNode.GetNext();
        }

        currentNode.SetNext(null);
    }

    public void Reverse(Node<T> head) {

        if (this.Size() == 0) return;

        Node<T> prev = null;
        Node<T> currentNode = head;
        Node<T> next = currentNode.GetNext();
        Node<T> temp;

        while (next != null && next.GetNext() != null) {
            temp = next.GetNext();
            currentNode.SetNext(prev);
            next.SetNext(currentNode);
            prev = next;
            currentNode = temp;
            next = currentNode.GetNext();
        }

        currentNode.SetNext(prev);

        if (next != null) {
            next.SetNext(currentNode);
            this.head = next;
        }
        else {
            this.head = currentNode;
        }
    }

    public Node<T> GetHead() {
        return this.head;
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
