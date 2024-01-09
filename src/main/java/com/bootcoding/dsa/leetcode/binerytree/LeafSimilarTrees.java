package com.bootcoding.dsa.leetcode.binerytree;

import java.util.List;
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstTreeLeaves = new ArrayList<>();
        List<Integer> secondTreeLeaves = new ArrayList<>();
        preOrder(root1,firstTreeLeaves);
        preOrder(root2,secondTreeLeaves);
        return firstTreeLeaves.equals(secondTreeLeaves);
    }
    public void preOrder(TreeNode root,List<Integer> treeLeavesList){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            treeLeavesList.add(root.val);
        }
        preOrder(root.left,treeLeavesList);
        preOrder(root.right,treeLeavesList);
    }
}
