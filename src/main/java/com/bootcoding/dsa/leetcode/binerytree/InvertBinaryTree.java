package com.bootcoding.dsa.leetcode.binerytree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);

        root.left = n2;
        root.right = n7;
        n2.left=n1;
        n2.right=n3;
        n7.left=n6;
        n7.right=n9;
        n9.left=n10;


    }
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
