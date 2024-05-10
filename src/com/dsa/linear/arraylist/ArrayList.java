package com.dsa.linear.arraylist;

import com.interfaces.List;

public class ArrayList <T> implements List <T> {

    private final int DEFAULT_CAPACITY = 10;

    private Object[] list;
    private int capacity;
    private int size;

    public ArrayList(int capacity) {

        this.capacity = capacity;
        this.size = 0;
        this.list = new Object[this.capacity];
    }

    public ArrayList() {

        this.capacity = this.DEFAULT_CAPACITY;
        this.size = 0;
        this.list = new Object[this.capacity];
    }

    @Override
    public void Insert(T data) {

        if (this.size == this.capacity) {

            this.Expand();
        }

        this.list[this.size] = data;
        this.size++;
    }

    @Override
    public void InsertAt(int index, T data) {

        if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException();

        if (this.size + 1 >= this.capacity) {
            this.Expand();
        }

        Object[] temp = new Object[this.capacity];

        for (int i = 0; i < index; i++) {

            temp[i] = this.list[i];
        }

        temp[index] = data;

        for (int i = index + 1; i <= this.size; i++) {

            temp[i] = this.list[i - 1];
        }

        this.list = temp;
        this.size++;
        System.out.println(this.size + " " + this.capacity);
    }

    @Override
    public void Remove(int index) {

        if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException();

        // 1 2 3 4 5
        Object temp[] = new Object[this.capacity];

        for (int i = 0; i < index; i++) {

            temp[i] = this.list[i];
        }

        for (int i = index + 1; i < this.size; i++) {

            temp[i-1] = this.list[i];
        }

        this.list = temp;
        this.size--;
    }

    @Override
    public int Size() {
        return this.size;
    }

    @Override
    public void RemoveFirst() {

        if (this.size == 0) throw new IndexOutOfBoundsException();

        Object[] temp = new Object[this.capacity];

        for (int i = 1; i < this.size; i++) {

            temp[i-1] = this.list[i];
        }

        this.list = temp;
        this.size--;
    }

    @Override
    public void RemoveLast() {

        if (this.size == 0) throw new IndexOutOfBoundsException();

        Object[] temp = new Object[this.capacity];

        for (int i = 0; i < this.size - 1; i++) {

            temp[i] = this.list[i];
        }

        this.list = temp;
        this.size--;
    }

    @Override
    public void Reverse() {

        if (this.size == 0)
            return;

        Object[] temp = new Object[this.capacity];

        int index = 0;

        for (int i = this.size - 1; i >= 0; i--) {

            temp[index] = this.list[i];
            index++;
        }

        this.list = temp;
    }

    private void Expand() {

        this.capacity = this.capacity * 2;

        Object[] temp = new Object[this.capacity];

        for (int i = 0; i < this.list.length; i++) {

            temp[i] = this.list[i];
        }

        this.list = temp;
    }

    @Override
    public String toString() {

        if (this.size == 0) return "[]";

        String data = "";

        for (int i = 0; i < this.size; i++) {

            data += this.list[i] + ", ";
        }

        return "[ " + data.substring(0, data.length() - 2) + " ]";
    }
}
