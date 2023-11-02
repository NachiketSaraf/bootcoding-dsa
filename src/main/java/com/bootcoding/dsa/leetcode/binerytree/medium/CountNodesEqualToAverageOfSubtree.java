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

        System.out.println( averageOfSubtree(root));
        System.out.println( averageOfSubtreeBruteForce(root));
    }

    // O(n) approach
    public static int averageOfSubtree(TreeNode root) {
        int[] result = new int[1];
        findSum(root,result);
        return result[0];
    }

    private static int[] findSum(TreeNode root, int[] result) {
        if (root == null) return new int[]{0,0};

        int[] left = findSum(root.left,result);
        int[] right = findSum(root.right,result);

        int totalSum = left[0]+right[0]+ root.val;
        int totalCount= left[1]+right[1]+1;

        int avg = totalSum/totalCount;

        if (avg == root.val) result[0]++;

        return new int[]{totalSum,totalCount};

    }

    // O(n^2)
    public static int averageOfSubtreeBruteForce(TreeNode root) {
        int[] result = new int[1];
        solve(root,result);
        return result[0];
    }

    private static void solve(TreeNode root, int[] result) {
        if (root == null) return;

        int[] count = {0};
        int totalSum = sum(root, count);
        int avg =totalSum / count[0];

        if (avg == root.val) result[0]++;

        solve(root.left,result);
        solve(root.right,result);
    }
    private static int sum(TreeNode root, int[] count) {
        if (root == null) return 0;

        count[0]++;

        int leftSum = sum(root.left, count);
        int rightSum = sum(root.right, count);

        return leftSum + rightSum + root.val;
    }

}
