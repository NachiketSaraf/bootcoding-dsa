package com.bootcoding.dsa.leetcode.linkedlist;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(2);
        ListNode forthnode = new ListNode(1);
        ListNode fifthnode = new ListNode(1);

        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        System.out.println(isPalindrome(firstnode));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        ListNode slow = head;
        ListNode fast = head;

        //if the linked list is null or have only single element
        if (head==null || head.next==null) return true;

        //find middle of linked list
        while (fast.next != null && fast.next.next != null ){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse the right half
        slow.next=reverseList(slow.next);
        slow=slow.next;

        //check the left half with right half equal or not
        while (slow!=null){
            if (current.val != slow.val) return false;
            current=current.next;
            slow=slow.next;
        }
        return true;
    }

    //method for reversing linkedlist
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
