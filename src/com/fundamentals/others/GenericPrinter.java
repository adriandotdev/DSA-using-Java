package com.fundamentals.others;

public class GenericPrinter <T> {

    T data;

    public GenericPrinter(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println(this.data);
    }
}
