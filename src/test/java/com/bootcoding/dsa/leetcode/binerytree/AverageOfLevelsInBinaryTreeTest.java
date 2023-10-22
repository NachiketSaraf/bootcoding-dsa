//package com.bootcoding.dsa.leetcode.binerytree;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AverageOfLevelsInBinaryTreeTest {
//    AverageOfLevelsInBinaryTree avg = new AverageOfLevelsInBinaryTree();
//    @Test
//    void testAverageOfLevels() {
//        TreeNode root = new TreeNode(3);
//        TreeNode n1 = new TreeNode(9);
//        TreeNode n2 = new TreeNode(20);
//        TreeNode n3 = new TreeNode(15);
//        TreeNode n4 = new TreeNode(7);
//
//
//        root.left = n1;
//        root.right = n2;
//        n2.left = n3;
//        n2.right = n4;
//
//        double[] expected = {3.00000,14.50000,11.00000};
//
//        List<Double> output = avg.averageOfLevels(root);
//
//        assertArrayEquals(expected,output);
//    }
//}