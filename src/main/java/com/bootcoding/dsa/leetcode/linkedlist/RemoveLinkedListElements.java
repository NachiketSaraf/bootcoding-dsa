package com.bootcoding.dsa.leetcode.linkedlist;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;
import com.bootcoding.dsa.linkedlist.Node;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(6);
        ListNode forthnode = new ListNode(3);
        ListNode fifthnode = new ListNode(4);
        ListNode sixthnode = new ListNode(5);
        ListNode seventhnode = new ListNode(6);



        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode.next= sixthnode;
        sixthnode.next= seventhnode;
        seventhnode.next = null;
        int val= 6;
//        ListNode h = removeElements(head,val);
//        printList(head);
        ListNode h  = removeElements2(head,val);
        printList(h);

    }

    public static void printList(ListNode head){
        ListNode temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }
    public static ListNode removeElements2(ListNode head, int val){
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            if(temp.val == val){
                if(prev == null){
                    head = temp.next;
                }else{
                    prev.next = temp.next;
                }
            }else {
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode next = temp.next;
        while (temp!= null){
            if (temp.next.val==val){
                if ( next.val == val && temp.next.next==null ){
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