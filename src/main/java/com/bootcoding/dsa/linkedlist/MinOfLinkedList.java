package com.bootcoding.dsa.linkedlist;

public class MinOfLinkedList {
    public static void main(String[] args) {
        Node firstnode = new Node(3);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(5);
        Node forthnode = new Node(4);
        Node fifthnode = new Node(1);

        Node head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode = null;

        printMin(head);
    }

    private static void printMin(Node head) {
        Node temp = head;
        int min = temp.data;
        while (temp != null){
            if (temp.data<min){
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.println(min);
    }
}
