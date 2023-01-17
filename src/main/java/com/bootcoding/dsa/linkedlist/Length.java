package com.bootcoding.dsa.linkedlist;

public class Length {
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);
        Node fifthNode = new Node(5);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next=thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;
        fifthNode = null;

        findLength(head);
    }

    private static void findLength(Node head) {
        Node temp = head;
        int c = 0;
        while (temp != null){
            c++;
            temp= temp.next;
        }
        System.out.println(c);
    }
}
