package com.bootcoding.dsa.leetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(1);
        ListNode thirdnode = new ListNode(1);
//        ListNode forthnode = new ListNode(3);
//        ListNode fifthnode = new ListNode(3);
//        ListNode sixthnode = new ListNode(6);
//        ListNode seventhnode = new ListNode(7);
//        ListNode eighthnode = new ListNode(8);
//        ListNode ninthnode = new ListNode(9);


        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
//        thirdnode.next = forthnode;
//        forthnode.next = fifthnode;
//        fifthnode = null;
        ListNode t=  deleteDuplicates(head);
        printList(t);
    }
    public static void printList(ListNode head){
        ListNode temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        if(temp==null||temp.next==null){
                return head;
            }
        while (temp.next != null){
            if(temp.next.val == temp.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;








//        ListNode prev = null;
//        while (temp != null && temp.next==null){
//            if(prev==null&&temp.next==null){
//                return head;
//            }
//            if (prev == null){
//                prev = temp;
//                temp =temp.next;
//            }
//            if (prev.val==temp.val){
//               prev.next=temp.next;
//            }
//            prev=temp;
//            temp= temp.next;
//        }
//        return head;
    }
}
