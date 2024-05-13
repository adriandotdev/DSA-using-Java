package com.dsa.nonlinear.binarytree;

public class Node<T> {

    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data) {
        this.data = data;
    }

    public T GetData() {
        return data;
    }

    public Node<T> GetLeft() {
        return left;
    }

    public void SetLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> GetRight() {
        return right;
    }

    public void SetRight(Node<T> right) {
        this.right = right;
    }
}
