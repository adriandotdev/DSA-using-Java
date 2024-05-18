package com.dsa.nonlinear;

import com.dsa.linear.queue.Queue;
import com.dsa.linear.stack.Stack;

import java.util.Iterator;

public class Tree<T> {

    private Node<T> root;
    private Queue<Node<T>> queue;

    public Tree() {
        this.queue = new Queue<>();
    }

    public void Insert(T key) {

        Node<T> newNode = new Node<>(key);

        if (this.root == null) {
            this.root = newNode;
            this.queue.Enqueue(this.root);
            return;
        }

        for (Node<T> node : this.queue) {

            if (node.GetLeft() == null) {
                node.SetLeft(newNode);

                break;
            }

            if (node.GetRight() == null) {
                node.SetRight(newNode);

                break;
            }
        }
        this.queue.Enqueue(newNode);
    }

    public void PreOrder() {

        String visitedNode = "";
        Stack<Node<T>> s = new Stack<>();
        Node<T> current = this.root;

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

    public void PostOrder() {

        String visitedNodes = "";
        Stack<Node<T>> s = new Stack<>();
        Node<T> current = this.root;

        while (current != null || !s.IsEmpty()) {

            while (current != null) {

                s.Push(current);

//                if (current.GetRight() != null) {
//                    s.Push(current.GetRight());
//                }

                current = current.GetLeft();
            }
        }
        System.out.println(visitedNodes);
    }

    public void PreOrderTraversalIteratively() {

        String data = "";
        Stack<Node<T>> s = new Stack<>();
        Node<T> current = this.root;

        while (current != null) {

            data += current.GetKey() + " ";

            if (current.GetRight() != null) {
                s.Push(current.GetRight());
            }

            if (current.GetLeft() != null) {
                current = current.GetLeft();
                continue;
            }

            if (!s.IsEmpty()) {
                current = s.Pop();
            } else if (s.IsEmpty()){
                break;
            }
        }

        System.out.println("PRE-ORDER: " + data);
    }

    public void PostOrderTraversalIteratively() {

        String data = "";
        Stack<Node<T>> s = new Stack<>();
        Stack<Node<T>> leftAndRightNodes = new Stack<>();

        Node<T> current = this.root;

        s.Push(this.root);

        while (!s.IsEmpty()) {

            if (current == null && !s.IsEmpty()) {
                data += s.Peek().GetKey() + " ";

                if (!leftAndRightNodes.IsEmpty() && (s.Peek().GetLeft() == leftAndRightNodes.Peek() || s.Peek().GetRight() == leftAndRightNodes.Peek())) {

                    leftAndRightNodes.Push(s.Pop());
                    current = s.Peek();

                    continue;
                }

                if (s.Peek().GetRight() != null
                        && s.Peek() != s.Peek().GetRight()) {
                    s.Push(s.Peek().GetRight());
                    continue;
                }

                if (s.Peek().GetLeft() != null && s.Peek() != s.Peek().GetLeft()) {
                    s.Push(s.Peek().GetLeft());
                    current = s.Peek();
                    continue;
                }

                leftAndRightNodes.Push(s.Pop());
            }
            else {
                if (s.Peek() != current) {
                    s.Push(current);
                }

                if (!leftAndRightNodes.IsEmpty() &&
                        (s.Peek().GetLeft() == leftAndRightNodes.Peek() || s.Peek().GetRight() == leftAndRightNodes.Peek())) {

                    data += s.Peek().GetKey() + " ";
                    leftAndRightNodes.Push(s.Pop());

                    if (!s.IsEmpty())
                        current = s.Peek();

                    continue;
                }

                if (current != null && current.GetRight() != null) {
                    s.Push(current.GetRight());
                }

                if (current != null && current.GetLeft() != null) {
                    s.Push(current.GetLeft());
                    current = current.GetLeft();
                    continue;
                } else {
                    current = null;
                }
            }
        }
        System.out.println("POST-ORDER: " + data);
    }

    public void InOrderTraversalIteratively() {

        String data = "";
        Node<T> current = this.root;
        Stack<Node<T>> s = new Stack<>();

        while (!s.IsEmpty()) {

            if (current.GetRight() != null) {
                s.Push(current.GetRight());
            }

            s.Push(current);


        }
    }

    @Override
    public String toString() {

        String data = "";

        if (this.root == null) return "[]";

        data += this.root.GetKey() + ", ";
        for (Node<T> node : this.queue) {

//            System.out.println("CURRENT: " + node.GetKey());

            if (node.GetLeft() != null) {
//                System.out.println("LEFT: " + node.GetLeft().GetKey());
                data += node.GetLeft().GetKey() + ", ";
            }

            if (node.GetRight() != null) {
//                System.out.println("RIGHT: " + node.GetRight().GetKey());
                data += node.GetRight().GetKey() + ", ";
            }
        }

        return "[ " + data.substring(0, data.length() - 2) + " ]";
    }
}
