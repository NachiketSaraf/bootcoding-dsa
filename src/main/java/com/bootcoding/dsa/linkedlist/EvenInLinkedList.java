package com.bootcoding.dsa.linkedlist;

public class EvenInLinkedList {
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

        printEven(head);
    }

    private static void printEven(Node head) {
        Node temp = head;
        while (temp.next != null){
            if (temp.data % 2 == 0){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
}
