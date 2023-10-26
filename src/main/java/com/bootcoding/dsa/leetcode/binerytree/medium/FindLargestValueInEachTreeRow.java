package com.bootcoding.dsa.leetcode.binerytree.medium;

import com.bootcoding.dsa.leetcode.binerytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {
    public static void main(String[] args) {

    }
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int max_val = Integer.MIN_VALUE;
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                max_val = Math.max(max_val, node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            result.add(max_val);
        }
        return res;
    }
}
