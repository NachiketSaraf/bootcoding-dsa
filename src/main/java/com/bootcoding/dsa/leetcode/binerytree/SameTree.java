package com.bootcoding.dsa.leetcode.binerytree;

public class SameTree {
    public static void main(String[] args) {
        TreeNode pRoot = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p4 = new TreeNode(4);
        TreeNode p5 = new TreeNode(5);

        pRoot.left = p2;
        pRoot.right = p3;
        p3.left = p4;
        p3.right = p5;

        TreeNode qRoot = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);
        TreeNode q3 = new TreeNode(3);
        TreeNode q4 = new TreeNode(4);
        TreeNode q5 = new TreeNode(5);

        qRoot.left = q2;
        qRoot.right = q3;
        q3.left = q4;
        q2.right = q5;

        System.out.println(isSameTree(pRoot,qRoot));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return (p==q);
        }
        return(p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
