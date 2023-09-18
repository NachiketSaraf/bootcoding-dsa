package com.bootcoding.dsa.leetcode.binerytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(7);


        root.left = n1;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;
        List<Double> a = averageOfLevels(root);
        for (Double d:a) {
            System.out.println(d);
        }
    }
    public static List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> ans = new ArrayList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            double sum = 0;

            for (int i = 0; i < n; i++) {
                if (queue.peek().left != null) queue.add(queue.peek().left);
                if (queue.peek().right != null) queue.add(queue.peek().right);
                sum += queue.poll().val;
            }
            ans.add(sum / n);
        }

        return ans;
    }
}
