package com.bootcoding.dsa.bst;

import java.util.ArrayList;

public class Inorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(16);
        TreeNode n4 = new TreeNode(14);
        TreeNode n5 = new TreeNode(15);
        TreeNode n6 = new TreeNode(20);

        root.left = n2;
        root.right = n3;
        n3.left = n4;
        n3.right = n6;
        n4.right = n5;

        inorder(root);
    }
    public static void inorder(TreeNode root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
