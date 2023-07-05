package com.bootcoding.dsa.linkedlist;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;

public class DeleteMid {
    public static void main(String[] args) {
        Node firstnode = new Node(1);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(3);
        Node forthnode = new Node(4);
        Node fifthnode = new Node(5);


        Node head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode = null;

        printAfterDelete(head);
    }


    private static void printAfterDelete(Node head) {
        Node temp = head;
        int nodeCounter = 1;
        int halfCounter;

        while (temp != null) {
            nodeCounter++;
            temp = temp.next;
        }
        halfCounter = (nodeCounter) / 2;
        int count = 1;
        temp = head;
        while(temp != null){
            if(count++ == halfCounter - 1){
                temp.next =  temp.next.next;
            }
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}
