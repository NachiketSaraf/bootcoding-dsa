package com.bootcoding.dsa.leetcode.binerytree;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(3);
        TreeNode m4 = new TreeNode(4);

        root.left = n2;
        root.right = m2;
        n2.left = n3;
        n2.right=n4;
        m2.left=m4;
        m2.right=m3;

        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricCheck(root.left,root.right);
    }
    public static boolean isSymmetricCheck(TreeNode left,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if (left.val!=right.val){
            return false;
        }
        return isSymmetricCheck(left.left,right.right)
                &&
                isSymmetricCheck(left.right,right.left);
    }
}
