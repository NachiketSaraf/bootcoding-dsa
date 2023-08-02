package com.bootcoding.dsa.bst;

public class FindElement {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(16);
        TreeNode n4 = new TreeNode(14);
        TreeNode n5 = new TreeNode(15);
        TreeNode n6 = new TreeNode(20);

        root.left = n2;
        root.right = n3;
        n3.left = n4;
        n3.right = n6;
        n4.right = n5;

        System.out.println();
        Inorder.inorder(search(root,15));
    }

//    private static boolean search(TreeNode root , int target) {
//        if (root== null) return false;
//        if (root.data == target) return true;
//        return  (target< root.data)? search(root.left,target):search(root.right,target);
//    }
    private static TreeNode search(TreeNode root , int target) {
        if (root== null) return null;
        if (root.data == target) return root;
        if (target< root.data){
            if (root.left != null) {
                search(root.left, target);
            }
            else
                return root;

        }
        else {
            if (root.right != null){
                search(root.right,target);
            }
            else return root;

        }
        return root;
    }
}
