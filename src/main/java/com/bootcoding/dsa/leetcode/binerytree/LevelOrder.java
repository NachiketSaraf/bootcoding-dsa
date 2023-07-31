package com.bootcoding.dsa.leetcode.binerytree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);

        root.left = n2;
        root.right = n7;
        n2.left=n1;
        n2.right=n3;
        n7.left=n6;
        n7.right=n9;
        n9.left=n10;
        List<List<Integer>>  ans = levelOrder(root);
        for (List<Integer> level:ans) System.out.println(level);
    }
    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> subArray = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subArray.add(queue.poll().val);
            }
            ans.add(subArray);
        }
        return ans;
    }
}
