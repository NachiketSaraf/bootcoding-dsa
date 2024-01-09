package com.bootcoding.dsa.leetcode.binerytree;

import java.util.List;
import java.util.ArrayList;
public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(9);
        TreeNode n6 = new TreeNode(8);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(4);

        System.out.println(leafSimilar(root,root));
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstTreeLeaves = new ArrayList<>();
        List<Integer> secondTreeLeaves = new ArrayList<>();
        preOrder(root1,firstTreeLeaves);
        preOrder(root2,secondTreeLeaves);
        return firstTreeLeaves.equals(secondTreeLeaves);
    }
    public static void preOrder(TreeNode root,List<Integer> treeLeavesList){
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
