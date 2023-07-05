package com.bootcoding.dsa.leetcode.linkedlist;

import com.bootcoding.dsa.linkedlist.Node;

public class DeleteTheMiddleNodeOfALinkedList {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(3);
        ListNode forthnode = new ListNode(4);
        ListNode fifthnode = new ListNode(5);
        ListNode sixthnode = new ListNode(6);
        ListNode seventhnode = new ListNode(7);
        ListNode eighthnode = new ListNode(8);
        ListNode ninthnode = new ListNode(9);


        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode.next = null;
        ListNode head1 = deleteMiddle(head);
        printLinkedList(head1);


    }
    public static void printLinkedList(ListNode head)
    {
        ListNode temp = head;
        while (temp != null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        ListNode fast_ptr = head;
        ListNode slow_ptr = head;
        ListNode  prev=null;

        while (fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }

        prev.next= slow_ptr.next;
        return head;
    }
}
