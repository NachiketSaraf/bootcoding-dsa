package com.bootcoding.dsa.leetcode.bst.easy;

import com.bootcoding.dsa.leetcode.binerytree.TreeNode;

import java.lang.reflect.Array;
import java.util.*;

public class FindModeInBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        TreeNode node = new TreeNode(4);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(10);

        root.left=node;
        node.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        /*
                    7
                  /   \
                 4     8
                /     /  \
               4     8   10
         */
        int[] res= findMode(root);

        Arrays.stream(res).forEach(System.out::println);
    }

    //Without using any extra space

    static int currentVal =0;
    static int currentFreq = 0;
    static int maxFreq = 0;
    static ArrayList<Integer> ans = new ArrayList<>();
    public static int[] findMode(TreeNode root){
        inOrder(root);
        int[] res = ans.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
    public static void inOrder(TreeNode root){
        if (root == null) return;

        inOrder(root.left);

        if (currentVal == root.val){
            currentFreq++;
        }else {
            currentVal = root.val;
            currentFreq = 1;
        }

        if (currentFreq > maxFreq){
            ans.clear();
            maxFreq =currentFreq;
        }

        if (currentFreq == maxFreq ){
            ans.add(root.val);
        }

        inOrder(root.right);
    }


     //using extra space
//    public static int[] findMode(TreeNode root) {
//        HashMap<Integer,Integer> map =new HashMap<>();
//        ArrayList<Integer> ans = new ArrayList<>();
//        inOrder(root,map);
//
//        int maxFreq = 0;
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int key = entry.getKey();
//            int value = entry.getValue();
//
//            if (value > maxFreq) {
//                maxFreq = value;
//                ans.clear();
//                ans.add(key);
//            } else if (value == maxFreq) {
//                ans.add(key);
//            }
//        }
//
//
////        for (Integer keySet:map.keySet()){
////            if (map.get(keySet) > maxFreq ) {
////                ans.clear();
////                ans.add(keySet);
////                maxFreq=map.get(keySet);
////            } else if (maxFreq == keySet){
////                ans.add(map.get(keySet));
////            }
////        }
////
////        for (Integer key : map.keySet())
////            if (map.get(key)==maxFreq)
////                ans.add(key);
//
//        int[] res = ans.stream().mapToInt(Integer::intValue).toArray();
//        return res;
//    }
//    public static void inOrder(TreeNode root, HashMap<Integer,Integer> map ){
//        if (root == null){
//            return;
//        }
//
//        inOrder(root.left,map);
//        map.put(root.val, map.getOrDefault(root.val,0) +1 );
//
////        if (map.containsKey(root.val)){
////            int value = map.get(root.val);
////            map.put(root.val, value+1 );
////        }
////        else {
////            map.put(root.val, 1);
////        }
//
//        inOrder(root.right,map);
//    }

}
