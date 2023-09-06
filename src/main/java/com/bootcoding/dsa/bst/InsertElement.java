package com.bootcoding.dsa.bst;


public class InsertElement {
    public static final void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n2 = new TreeNode(14);
        TreeNode n3 = new TreeNode(10);
        TreeNode n4 = new TreeNode(77);
        TreeNode n5 = new TreeNode(95);
        TreeNode n6 = new TreeNode(20);

        root.left = null;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;
        n4.right = n5;

        insert(root, 4);
        insert(root,70);
        insert(root,7);
        insert(root,2);
        insert(root,3);
        insert(root,19);
        insert(root,22);
        insert(root,21);

        inorder(root);
    }


    private static void insert(TreeNode root, int x) {
        if (root==null) return;
        if (root.data == x) return;
        if (x < root.data)
            if (root.left != null) insert(root.left,x);
            else root.left = new TreeNode(x);
        else
            if (root.right != null) insert(root.right,x);
            else root.right = new TreeNode(x);
    }


    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }


}


//if (root == null) {
//        return;
//        }
//        if (root.data == x) return;
//
//        if (root.left == null || root.right == null) {
//        if ((x < root.data)) {
//        root.left = new  TreeNode(x);
//        return;
//        }else {
//        root.right = new TreeNode(x);
//        }
//        }
//        if ((x < root.data)) {
//        insert(root.left, x);
//        }else {
//        insert(root.right, x);
//        }
