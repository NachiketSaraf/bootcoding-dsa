package com.bootcoding.dsa.binarytree;

public class IsFull {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        System.out.println(checkFull(root));
    }
    public static boolean checkFull(TreeNode root){
        if(root == null){
            return true;
        }
        if ((root.left == null) && (root.right == null)){
            return true;
        }
        return  ((root.left != null) && (root.right != null) && checkFull(root.left) && checkFull(root.right));
    }
}
