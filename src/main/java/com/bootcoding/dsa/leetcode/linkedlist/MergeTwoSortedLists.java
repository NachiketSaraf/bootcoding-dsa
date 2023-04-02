package com.bootcoding.dsa.leetcode.linkedlist;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(4);
        ListNode firstNode1 = new ListNode(1);
        ListNode secondNode1 = new ListNode(3);
        ListNode thirdNode1 = new ListNode(4);



        ListNode head1 = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next =null;
        ListNode head2 = firstNode1;
        firstNode1.next = secondNode1;
        secondNode1.next = thirdNode1;
        thirdNode1.next = null;

        ListNode res= mergeTwoLists(head1,head2);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode res = list1;
        while (list1 != null && list2 != null){
            ListNode tmp = null;
            while (list1 !=null && list1.val <= list2.val ){
                tmp = list1;
                list1 = list1.next;
            }
            tmp.next = list2;

            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        return res;
    }
}
