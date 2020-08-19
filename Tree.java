package com.company;

public class Tree {
    Node root;

    private Node insert(Node node, int data){
        if (node == null){
            return new Node(data);
        }
        if (data < node.data){
            node.left = insert(node.left, data);
        }else{
            node.right = insert(node.right, data);
        }
        return node;
    }

    public void insert(int data){
        root = insert(root, data);
    }

    private boolean contains(Node node, int data){
        if (node == null){
            return false;
        }
        if (data == node.data){
            return true;
        }else if (data < node.data){
            return contains(node.left, data);
        }else{
            return contains(node.right, data);
        }
    }

    public boolean contains(int data){
        return contains(root, data);
    }

    private void print(Node node){
        if (node == null){
            return;
        }else{
            print(node.left);
            System.out.println(node.data);
            print(node.right);
        }
    }

    public void print(){
        print(root);
    }

/*    public void Insert(int value){
        Node node = new Node(value);
        Node current = root;
        if (value >= node.data){
            if (current.right != null) {
                current = current.right;
            }else{
                current.right = node;
                current = node.parent;
            }
        }else{
            if (current.left != null) {
                current = current.left;
            }else{
                current.left = node;
                current = node.parent;
            }
        }
    }

    public void printInOrder(Tree tree){
        Tree copy = tree;
        Node current = copy.root;
        while (root != null) {
            if (current.left == null) {
                System.out.println(current.data);
                if (current.right == null){
                    current = current.parent;
                    current.left = null;
                }else{
                    current = current.right;
                }
            }else{
                System.out.println(current.left.data);
                current.left = null;
            }
        }
    }

/*    public boolean Contains(int value){
        Node current = root;
        if (value > current.data){
            if (current.right == null) {
                return false;
            }else if (current.right.data == value){
                return true;
            }
            else{
                current = current.right;
            }
        }else{
            if (current.left == null) {
                return false;
            }else if (current.left.data == value){
                return true;
            }
            else{
                current = current.left;
            }
        }
    }

    /*public void Pop(){
        if (top == null){
            throw new EmptyStackException();
        }
        Node node = top;
        top = node.next;
        node.next = null;
    }

    public void Push(char value){
        Node node = new Node(value);
        if (top == null){
            top = node;
        }else{
            node.next = top;
            top = node;
        }
    }

    public char Peek(){
        if (top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }*/
}
