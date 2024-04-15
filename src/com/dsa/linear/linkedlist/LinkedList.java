package com.dsa.linear.linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    /**
     * Inserts a new node to a linked list.
     * @param data node data
     */
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

    /**
     * Inserts a new node at specified index.
     * @param index index of new node
     * @param data data of new node
     */
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

    public void RemoveAt(int index) {
        if (index >= this.Size()) throw new IndexOutOfBoundsException("Invalid index");

        if (index == 0) this.head = this.head.GetNext();

        Node<T> currentNode = this.head;
        int counter = 0;

        // 1 2 3 4
        while (currentNode != null) {

            if (counter == index - 1) {
                currentNode.SetNext(currentNode.GetNext().GetNext());
            }

            currentNode = currentNode.GetNext();
            counter++;
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
    // 1 2 3 4 5

    public void Reverse(Node<T> head) {

        // 1, 2, 3, 4, 5, 6, 7
        Node<T> prev = null; // null 2 4 6
        Node<T> currentNode = head; // 1 3 5 7
        Node<T> next = currentNode.GetNext(); // 2 4 6 null
        // next of next: 3 5
        Node<T> temp = prev; // null 3 5 7

        while (next != null && next.GetNext() != null) {
            temp = next.GetNext(); //
            currentNode.SetNext(prev); //
            next.SetNext(currentNode); //
            prev = next; //
            currentNode = temp; //
            next = currentNode.GetNext(); //
        }

        currentNode.SetNext(prev); //

        if (next != null) {
            next.SetNext(currentNode); //
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

        Node<T> currentNode = this.head;
        String data = "";

        while (currentNode != null) {

            data += currentNode.GetData().toString() + ", ";

            currentNode = currentNode.GetNext();
        }

        return "[ " + data.substring(0, data.length() - 2) + " ]";
    }
}

