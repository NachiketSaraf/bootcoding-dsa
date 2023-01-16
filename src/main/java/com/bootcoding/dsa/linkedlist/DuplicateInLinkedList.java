package com.bootcoding.dsa.linkedlist;

public class DuplicateInLinkedList {
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

        printDuplicat(head);
    }

    private static void printDuplicat(Node head) {
        Node temp = head;

}

}
