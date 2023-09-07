package com.bootcoding.dsa.leetcode.linkedlist.medium;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(3);
        ListNode forthnode = new ListNode(4);
        ListNode fifthnode = new ListNode(5);
        ListNode sixthnode = new ListNode(6);
        ListNode seventhnode = new ListNode(7);

        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode.next = sixthnode;
        sixthnode.next = seventhnode;
        seventhnode.next = null;

        ListNode newHead = reverseBetweenOptimized(firstnode, 2, 5);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

    public static ListNode reverseBetweenOptimized(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        ListNode prev = null;
        ListNode tail = null;

        dummy.next = head;
        prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        tail = prev.next;

        ListNode temp = null;
        for (int i = 0; i < (right-left); i++) {
            temp = prev.next;
            prev.next = tail.next;
            tail.next = tail.next.next;
            prev.next.next = temp;
        }
        return dummy.next;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        ListNode prev = null;

        int count = 1;
        while (count != left) {
            prev = current;
            current = current.next;
            count++;
        }
        ListNode start = current;
        while (count != right) {
            current = current.next;
            count++;
        }
        ListNode rest = current.next;
        current.next = null;

        ListNode newHead = reverseList(start);
        if (prev != null) {
            prev.next = newHead;
        }
        current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = rest;
        if (left == 1) {
            return newHead;
        }
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
