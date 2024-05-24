package com.dsa.nonlinear.tree;

import com.dsa.linear.queue.Queue;
import com.dsa.linear.stack.Stack;

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

    public void PreOrderTraversal() {

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

    public void InOrderTraversal() {

        String visitedNodes = "";
        Stack<Node<T>> s = new Stack<>();
        Node<T> current = this.root;

        while (current != null || !s.IsEmpty()) {

            while (current != null) {
                s.Push(current);
                current = current.GetLeft();
            }

            current = s.Pop();
            visitedNodes += current.GetKey() + " ";
            current = current.GetRight();
        }

        System.out.println("IN-ORDER: " + visitedNodes);
    }

    public void PostOrderTraversal() {

        String visitedNodes = "";
        Stack<Node<T>> s = new Stack<>();
        Node<T> current = this.root;
        Node<T> lastVisitedNode = null;

        while (current != null || !s.IsEmpty()) {

            while (current != null) {

                s.Push(current);

                if (current.GetRight() != null) {
                    s.Push(current.GetRight());
                }

                current = current.GetLeft();
            }

            current = s.Peek();

            if ((current.GetRight() == null) || (current.GetRight() == lastVisitedNode || current.GetLeft() == lastVisitedNode)) {
                visitedNodes += current.GetKey() + " ";
                lastVisitedNode = s.Pop();
                current = null;
            }
            else {
                current = s.Pop();
            }
        }
        System.out.println("POST-ORDER: " + visitedNodes);
    }

    public void LevelTraversal() {

        Queue<Node<T>> q = new Queue<>();
        q.Enqueue(this.root);
        String visitedNodes = "";

        while (!q.IsEmpty()) {

            visitedNodes += q.Peek().GetKey() + " ";

            if (q.Peek().GetLeft() != null) {
                q.Enqueue(q.Peek().GetLeft());
            }

            if (q.Peek().GetRight() != null) {
                q.Enqueue(q.Peek().GetRight());
            }

            q.Dequeue();
        }

        System.out.println("LEVEL-TRAVERSAL: " + visitedNodes);
    }

    public void ReverseInorderTraversal() {

        Stack<Node<T>> s = new Stack<>();
        Node<T> current = this.root;
        String visitedNodes = "";

        while (current != null || !s.IsEmpty()) {

            while (current != null) {

                s.Push(current);
                current = current.GetRight();
            }

            current = s.Pop();
            visitedNodes += current.GetKey() + " ";
            current = current.GetLeft();
        }

        System.out.println("REVERSE-INORDER-TRAVERSAL: " + visitedNodes);
    }

    public void MaximumDepth() {

        Queue<Node<T>> q = new Queue<>();
        q.Enqueue(this.root);

        int depth = 0;

        while (!q.IsEmpty()) {

            if (q.Peek().GetLeft() != null) {
                q.Enqueue(q.Peek().GetLeft());
            }

            if (q.Peek().GetRight() != null) {
                q.Enqueue(q.Peek().GetRight());
            }

            if (q.Peek().GetLeft() != null || q.Peek().GetRight() != null) {
                depth++;
            }

            q.Dequeue();
        }

        System.out.println("DEPTH: " + (depth - 1));
    }

    @Override
    public String toString() {

        String data = "";

        if (this.root == null) return "[]";

        data += this.root.GetKey() + ", ";
        for (Node<T> node : this.queue) {

            if (node.GetLeft() != null) {
                data += node.GetLeft().GetKey() + ", ";
            }

            if (node.GetRight() != null) {
                data += node.GetRight().GetKey() + ", ";
            }
        }

        return "[ " + data.substring(0, data.length() - 2) + " ]";
    }
}
