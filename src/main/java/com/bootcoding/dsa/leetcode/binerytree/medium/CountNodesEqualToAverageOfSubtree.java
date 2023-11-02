package com.bootcoding.dsa.leetcode.binerytree.medium;

import com.bootcoding.dsa.leetcode.binerytree.TreeNode;

public class CountNodesEqualToAverageOfSubtree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node = new TreeNode(8);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(6);

        root.left = node;
        root.right = node1;
        node.left = node2;
        node.right = node3;
        node1.right=node4;
        averageOfSubtree(root);

    }
    public static int averageOfSubtree(TreeNode root) {
        int[] result = new int[1];
        findSum(root,result);
        return result[0];
    }

    private static int[] findSum(TreeNode root, int[] result) {
        if (root== null) return new int[]{0,0};

        int[] left = findSum(root.left,result);
        int[] right = findSum(root.right,result);

        int totalSum = left[0]+right[0]+ root.val;
        int totalCount= left[1]+right[1]+1;

        int avg = totalSum/totalCount;

        if (avg == root.val) result[0]++;

        return findSum(root,result);

    }
}
