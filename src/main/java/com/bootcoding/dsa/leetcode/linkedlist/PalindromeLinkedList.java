package com.bootcoding.dsa.leetcode.linkedlist;

import com.bootcoding.dsa.linkedlist.Node;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(3);
        ListNode forthnode = new ListNode(2);
        ListNode fifthnode = new ListNode(5);

        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        ListNode slow = head;
        ListNode fast = head;

        if (head==null || head.next==null) return true;

        while (fast.next != null && fast.next.next != null ){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=reverseList(slow.next);
        slow=slow.next;

        while (slow!=null){
            if (current.val != slow.val) return false;
            current=current.next;
            slow=slow.next;
        }
        return true;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }


}
