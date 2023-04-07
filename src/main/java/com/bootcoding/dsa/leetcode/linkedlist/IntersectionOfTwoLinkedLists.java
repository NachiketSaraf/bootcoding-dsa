package com.bootcoding.dsa.leetcode.linkedlist;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode firstnodeA = new ListNode(4);
        ListNode secondnodeA = new ListNode(1);
        ListNode firstNodeB = new ListNode(5);
        ListNode secondNodeB = new ListNode(6);
        ListNode thirdNodeB = new ListNode(1);
        ListNode first = new ListNode(8);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(5);

        ListNode headA = firstnodeA;
        firstnodeA.next = secondnodeA;
        secondnodeA.next = first;
        ListNode headB = firstNodeB;
        firstNodeB.next = secondNodeB;
        secondNodeB.next = thirdNodeB;
        thirdNodeB.next =  first;
        ListNode res = getIntersectionNode(headA,headB);
        System.out.println(res.val);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB ==null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return b;
    }
}
