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
        // 1 2
        if (this.head == null) throw new IndexOutOfBoundsException("List is empty");

        if (index >= this.Size() || index < 0) throw new IndexOutOfBoundsException("Invalid index");

        if (index == 0) {
            this.head = this.head.GetNext();
            this.head.SetPrevious(null);
        }

        Node<T> currentNode = this.head;
        int counter = 0;

        while (counter != (index- 1)) {

            currentNode = currentNode.GetNext();
            counter++;
        }

        if (currentNode.GetNext().GetNext() != null) {
            currentNode.GetNext().GetNext().SetPrevious(currentNode);
        }

        currentNode.SetNext(currentNode.GetNext().GetNext());

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

        if (this.head == null) throw new IndexOutOfBoundsException("List is empty");

        if (this.Size() == 1) { this.head = null; return; }

        this.head = this.head.GetNext();
        this.head.SetPrevious(null);
    }

    @Override
    public void RemoveLast() {

        if (this.head == null) throw new IndexOutOfBoundsException("List is empty");

        Node<T> currentNode = this.head;
        int size = this.Size();
        int counter = 0;
        // 1 2
        while (counter < (size - 1)) {

            currentNode = currentNode.GetNext();
            counter++;
        }

        currentNode.SetNext(null);
    }

    @Override
    public void Reverse() {

        if (this.Size() == 0) return;

        Node<T> prev = null; // null 2
        Node<T> currentNode = this.head; // 1 3
        Node<T> next = currentNode.GetNext(); // 2  4
        Node<T> temp; // null 3

        while (next != null && next.GetNext() != null) {
            temp = next.GetNext();
            currentNode.SetNext(prev);
            next.SetNext(currentNode);
            currentNode.SetPrevious(next);
            prev = next;
            currentNode = temp;
            prev.SetPrevious(currentNode);
            next = currentNode.GetNext();
        }

        currentNode.SetNext(prev);
        currentNode.SetPrevious(next);

        if (next != null) {
            next.SetNext(currentNode);
            this.head = next;
            this.head.SetPrevious(null);
        }
        else {
            this.head = currentNode;
            this.head.SetPrevious(null);
        }
    }

    @Override
    public String toString() {

        if (this.head == null) return "[]";

        Node<T> currentNode = this.head;
        String data = "";

        while (currentNode != null) {

            data += currentNode.GetData().toString() + ", ";

            // Uncomment this when you want to test if the previous, current, and next node is correct.
//            System.out.println(currentNode.GetPrevious() != null ? currentNode.GetPrevious().GetData() + " " : null + " ");
//            System.out.println(currentNode.GetData() + " ");
//            System.out.println(currentNode.GetNext() != null ? currentNode.GetNext().GetData() + "\n" : null + "\n");
            // ============================
            currentNode = currentNode.GetNext();
        }

        return "[ " + data.substring(0, data.length() - 2) + " ]";
    }
}
