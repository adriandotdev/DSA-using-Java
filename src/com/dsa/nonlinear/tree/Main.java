package com.dsa.nonlinear.tree;

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
        t.Insert(8);
        t.Insert(9);
//        t.Insert(8);

        System.out.println(t);
        t.PreOrderTraversal();
        t.InOrderTraversal();
        t.PostOrderTraversal();
        t.LevelTraversal();
        t.ReverseInorderTraversal();
        t.MaximumDepth();
    }
}
