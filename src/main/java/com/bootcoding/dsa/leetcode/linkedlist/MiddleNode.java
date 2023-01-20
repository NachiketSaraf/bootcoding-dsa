package com.bootcoding.dsa.leetcode.linkedlist;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;

public class MiddleNode {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(3);
        ListNode forthnode = new ListNode(4);
        ListNode fifthnode = new ListNode(5);

        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode = null;
       ListNode h= middleNode(head);
       while (h!=null){
           System.out.println(h.val);
           h = h.next;
       }

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
