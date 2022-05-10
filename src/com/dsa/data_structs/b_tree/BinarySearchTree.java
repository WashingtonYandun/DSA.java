package com.dsa.data_structs.b_tree;

public class BinarySearchTree {
    public BstNode root;

    public BinarySearchTree(int rootValue){
        this.root = new BstNode(rootValue);
    }

    public BinarySearchTree(){
        this.root = null;
    }

    public BstNode insert(BstNode current, int data){
        if (this.root == null) {
            this.root = new BstNode(data);
            return this.root;
        }

        if (data < current.data) {
            if(current.left != null){
                current.left = insert(current.left, data);
            }
            current.right = new BstNode(data);
            return current.right;
        } else if (data > current.data) {
            if(current.right != null){
                insert(current.right, data);
            }
            current.right = new BstNode(data);
            return current.right;
        } else {
            return current;
        }
    }

    public boolean contains(BstNode node, int value){
        if (node == null) {
            return false;
        }
        if (value == node.data) {
            return true;
        }
        return value < node.data
                ? contains(node.left, value)
                : contains(node.right, value);
    }
}