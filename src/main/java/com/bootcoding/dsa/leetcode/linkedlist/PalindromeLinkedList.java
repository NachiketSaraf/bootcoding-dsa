package com.bootcoding.dsa.leetcode.linkedlist;

import com.bootcoding.dsa.linkedlist.Node;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(2);
        ListNode forthnode = new ListNode(1);
//        ListNode fifthnode = new ListNode(5);

        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
//        forthnode.next = fifthnode;
//        fifthnode = null;
        boolean n = isPalindrome(head);
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode temp = head;

        while (temp!=null){
            while (prev!=null){
                if (temp.val==prev.val){
                    temp=temp.next;
                    prev= prev.next;
                }
            }
            return true;
        }
        return false;
    }

}
