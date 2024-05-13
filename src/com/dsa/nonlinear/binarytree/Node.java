package com.dsa.nonlinear.binarytree;

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public int GetKey() {
        return data;
    }

    public Node GetLeft() {
        return left;
    }

    public void SetLeft(Node left) {
        this.left = left;
    }

    public Node GetRight() {
        return right;
    }

    public void SetRight(Node right) {
        this.right = right;
    }
}
