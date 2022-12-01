package com.fundemtals.practice.domain;

public class Forrest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        Tree tree3 = new Tree();
        Tree tree4 = new Tree();
        Tree tree5 = new Tree();
        Tree tree6 = new Tree();
        Tree tree7 = new Tree();
        tree.dynamicMethod();
        tree.staticMethod();

        System.out.println(Tree.getCount());
    }
}
