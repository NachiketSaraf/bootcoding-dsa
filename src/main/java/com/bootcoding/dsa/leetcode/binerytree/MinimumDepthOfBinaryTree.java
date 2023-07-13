package com.bootcoding.dsa.leetcode.binerytree;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left==null && root.right==null){
            return 1;
        }
        if (root.left==null || root.right==null){
            return 1+Math.max(minDepth(root.left),minDepth(root.right));
        }
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}
