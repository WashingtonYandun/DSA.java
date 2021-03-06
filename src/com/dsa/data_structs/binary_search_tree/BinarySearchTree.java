package com.dsa.data_structs.binary_search_tree;

public class BinarySearchTree {
    public BstNode root;

    public BinarySearchTree(int root){
        this.root = new BstNode(root);
    }

    public BinarySearchTree(){
        this.root = null;
    }

    public BstNode getRoot() {
        return root;
    }

    public void insert(BstNode current, int data){
        if (this.root == null) {
            this.root = new BstNode(data);
            return;
        }

        if (data < current.data) {
            if(current.left != null){
                insert(current.left, data);
            }else{
                current.left = new BstNode(data);
            }
        } else {
            if(current.right != null){
                insert(current.right, data);
            }else{
                current.right = new BstNode(data);
            }
        }
    }

    public void traversePreOrder(BstNode node){
        if(node != null){
            System.out.print(node.data +" ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(BstNode node){
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(BstNode node){
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
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
