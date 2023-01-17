package com.bootcoding.dsa.leetcode.linkedlist;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;
import com.bootcoding.dsa.linkedlist.Node;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(7);
        ListNode secondnode = new ListNode(7);
        ListNode thirdnode = new ListNode(7);
        ListNode forthnode = new ListNode(7);
        ListNode fifthnode = new ListNode(7);
        ListNode sixthnode = new ListNode(7);
        ListNode seventhnode = new ListNode(7);



        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode.next= sixthnode;
        sixthnode.next= seventhnode;
        seventhnode.next = null;
        int val= 7;
        ListNode h = removeElements(head,val);

    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while (temp!= null){
            if (temp.next.val==val){
                if (temp.next.val == val && temp.next.next==null ){
                    temp.next=null;
                }
                System.out.println("val "+ temp.val);

                if(temp.next != null)
                    temp.next = temp.next.next;
            }
            temp=temp.next;
        }
        temp= head;
//        while (temp!=null){
//            System.out.println(temp.val);
//            temp=temp.next;
//        }
return temp;
    }
}
//wap delete middle element in linked list