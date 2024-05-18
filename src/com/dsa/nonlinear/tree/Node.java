package com.dsa.nonlinear.tree;

public class Node<T> {

    private T key;
    private Node<T> left;
    private Node<T> right;

    public Node(T key) {
        this.key = key;
    }

    public T GetKey() {
        return this.key;
    }

    public void SetKey(T key) {
        this.key = key;
    }

    public Node<T> GetLeft() {
        return this.left;
    }

    public void SetLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> GetRight() {
        return this.right;
    }

    public void SetRight(Node<T> right) {
        this.right = right;
    }
}
