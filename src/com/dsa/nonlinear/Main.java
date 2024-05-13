package com.dsa.nonlinear;

public class Main {
    public static void main(String[] args) {

        Tree<Integer> t = new Tree<>();

        t.Insert(1);
        t.Insert(2);
        t.Insert(3);
        t.Insert(4);
        t.Insert(5);
        t.Insert(6);
        t.Insert(7);

        System.out.println(t);
        t.PreOrder();
        t.PostOrder();
//        t.PreOrderTraversalIteratively();
//        t.PostOrderTraversalIteratively();
    }
}
