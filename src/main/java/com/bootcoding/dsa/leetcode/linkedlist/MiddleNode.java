package com.bootcoding.dsa.leetcode.linkedlist;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;

public class MiddleNode {
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
        fifthnode = null;
       ListNode h= middleNodeTwoPointer(head);
       while (h!=null){
           System.out.println(h.val);
           h = h.next;
       }

    }
    public static ListNode middleNodeTwoPointer(ListNode head){
        ListNode fast_ptr = head;
        ListNode slow_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        return slow_ptr;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int nodeCounter = 0;

        int halfCounter;

        while (temp != null) {
            nodeCounter++;
            temp = temp.next;
        }
        halfCounter = (nodeCounter) / 2;
        temp = head;
        for (int i = 0; i < halfCounter; i++) {
            temp = temp.next;
        }
        head = temp;
        return head;

    }


}
