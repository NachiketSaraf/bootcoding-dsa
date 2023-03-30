package com.bootcoding.dsa.leetcode.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(3);
        ListNode forthnode = new ListNode(4);
        ListNode fifthnode = new ListNode(5);
        ListNode sixthnode = new ListNode(6);
//        ListNode seventhnode = new ListNode(7);
//        ListNode eighthnode = new ListNode(8);
//        ListNode ninthnode = new ListNode(9);


        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode.next = null;
        ListNode h= reverseList(head);
        while (h!=null){
            System.out.println(h.val);
            h = h.next;
        }
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
