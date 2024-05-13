package com.dsa.nonlinear.binarytree;

import com.dsa.linear.stack.Stack;

public class BinarySearchTree {

    private Node root;

    public void Insert(int data) {

        if (this.root == null) {

            this.root = new Node(data);
            return;
        }

        Node current = this.root;

        while (current != null) {

            if (current.GetKey() <= data) {

                if (current.GetRight() == null) {
                    current.SetRight(new Node(data));
                    current = null;
                }
                else {
                    current = current.GetRight();
                }
            }

            else {

                if (current.GetLeft() == null) {
                    current.SetLeft(new Node(data));
                    current = null;
                }
                else {
                    current = current.GetLeft();
                }
            }
        }
    }

    public void PreOrder() {

        String visitedNode = "";
        Stack<Node> s = new Stack<>();
        Node current = this.root;

        while (current != null || !s.IsEmpty()) {

            while (current != null) {
                visitedNode += current.GetKey() + " ";
                s.Push(current);
                current = current.GetLeft();
            }

            if (!s.IsEmpty())
                current = s.Pop().GetRight();
        }

        System.out.println("PRE-ORDER: " + visitedNode);
    }
}
