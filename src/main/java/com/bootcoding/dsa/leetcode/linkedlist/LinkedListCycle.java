package com.bootcoding.dsa.leetcode.linkedlist;

public class LinkedListCycle {
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
        fifthnode.next = sixthnode;
        sixthnode.next = seventhnode;
        seventhnode.next = eighthnode;
        eighthnode.next = ninthnode;
        ninthnode.next = fifthnode;

        findCycle(head);
    }

    private static void findCycle(ListNode head) {
        ListNode fastPtr =head ;
        ListNode slowPtr = head;

        while (fastPtr == null || fastPtr.next==null){
            if (fastPtr == null || fastPtr.next==null){
                System.out.println("no cycle found");
                break;
            }
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if (slowPtr==fastPtr){
                System.out.println("There is a cycle in LL");
                break;
            }
        }
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

}
