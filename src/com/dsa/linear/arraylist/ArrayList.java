package com.dsa.linear.arraylist;

import com.interfaces.List;

public class ArrayList <T> implements List<T> {

    private final int defaultCapacity = 10;

    private Object [] list;
    private int capacity;
    private int size;

    public ArrayList() {

        this.capacity = defaultCapacity;
        this.size = 0;
        this.list = new Object[this.capacity];
    }

    public ArrayList(int capacity) {

        this.capacity = capacity;
        this.size = 0;
        this.list = new Object[this.capacity];
    }

    @Override
    public void Insert(Object data) {

        if (this.size == 0) {
            this.list[0] = data;
            this.size++;
            return;
        }

        /* If the size is equal to the capacity of the array list, then we need to expand it */
        if (this.size == this.capacity) {

            Object[] tempArray = new Object[this.size * 2];

            for (int i = 0; i < this.list.length; i++) {

                tempArray[i] = this.list[i];
            }

            this.list = tempArray;
            this.capacity = this.list.length;
        }

        this.list[this.size] = data;
        this.size++;
    }

    @Override
    public void InsertAt(int index, Object data) {
        // 1 2 3 4 5 6 7 0 0 0 0 0

        if (index >= this.Size()) throw new IndexOutOfBoundsException("Invalid Index");

        if (this.size + 1 > this.capacity) {

            Object[] tempArray = new Object[this.size * 2];

            for (int i = 0; i < this.list.length; i++) {

                tempArray[i] = this.list[i];
            }

            this.list = tempArray;
            this.capacity = this.list.length;
        }

        Object[] tempArray = new Object[this.capacity];

        for (int i = 0; i < index; i++) {

            tempArray[i] = this.list[i];
        }


    }

    @Override
    public void RemoveStart() {

    }

    @Override
    public void RemoveEnd() {

    }

    @Override
    public void RemoveAt(int index) {

    }

    @Override
    public int Size() {
        return this.size;
    }

    @Override
    public String toString() {

        String data = "";

        for (int i = 0; i < this.size; i++) {

            data += this.list[i] + ", ";
        }

        return "[ " + data.substring(0, data.length() - 2) + " ]";
    }
}
