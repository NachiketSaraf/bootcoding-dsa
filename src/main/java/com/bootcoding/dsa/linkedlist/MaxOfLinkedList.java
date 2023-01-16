package com.bootcoding.dsa.linkedlist;

public class MaxOfLinkedList {
    public static void main(String[] args) {
        Node firstnode = new Node(3);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(5);
        Node forthnode = new Node(4);
        Node fifthnode = new Node(6);

        Node head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode = null;

        printMax(head);
    }

    private static void printMax(Node head) {
        Node temp = head;
        int max = temp.data;
        while (temp != null){
            if (temp.data>max){
                max = temp.data;
            }
            temp = temp.next;
        }
        System.out.println(max);
    }
}


