package com.bootcoding.dsa.leetcode.binerytree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    List<Integer> values = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return values;
        }
        values.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return values;
    }
}
