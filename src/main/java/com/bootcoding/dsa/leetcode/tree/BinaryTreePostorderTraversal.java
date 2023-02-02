package com.bootcoding.dsa.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {

    }
    List<Integer> values = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return values;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        values.add(root.val);
        return values;
    }
}
