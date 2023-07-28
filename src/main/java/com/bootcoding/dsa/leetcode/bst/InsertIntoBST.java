package com.bootcoding.dsa.leetcode.bst;

import com.bootcoding.dsa.binarytree.InorderBinaryTree;
import com.bootcoding.dsa.leetcode.binerytree.TreeNode;

public class InsertIntoBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n2 = new TreeNode(14);
        TreeNode n3 = new TreeNode(10);
        TreeNode n4 = new TreeNode(77);
        TreeNode n5 = new TreeNode(95);

        root.left = null;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;
        n4.right = n5;

        insertIntoBST(root, 4);
        insertIntoBST(root,70);
        insertIntoBST(root,7);
        insertIntoBST(root,2);
        insertIntoBST(root,3);
        insertIntoBST(root,19);
        insertIntoBST(root,22);
        insertIntoBST(root,21);

        inorder(root);
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null) return new TreeNode(val);
        if (root.val == val) return null;
        if (val < root.val)
            if (root.left != null) insertIntoBST(root.left,val);
            else root.left = new TreeNode(val);
        else
        if (root.right != null) insertIntoBST(root.right,val);
        else root.right = new TreeNode(val);
        return root;
    }
    public static void inorder(TreeNode root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
}
