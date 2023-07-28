package com.bootcoding.dsa.binarytree;


public class LevelOfTheTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;

        System.out.println(levelOfBinaryTree(root));
    }
    public static int levelOfBinaryTree(TreeNode root){
        if (root== null) return -1;

        int lh = levelOfBinaryTree(root.left);
        int rh = levelOfBinaryTree(root.right);

        return 1+Math.max(lh,rh);
    }
}
