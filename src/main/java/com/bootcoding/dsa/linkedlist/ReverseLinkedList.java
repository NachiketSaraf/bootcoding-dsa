package com.bootcoding.dsa.linkedlist;

public class ReverseLinkedList {
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
        printLinkedList(head);
        Node prev = reverseLinkedList(head);
        printLinkedList(prev);
}

    private static Node reverseLinkedList(Node head) {
        Node current = head;
        Node next = null;
        Node prev = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void printLinkedList(Node head)
    {
        Node temp = head;
        System.out.println();
        while (temp != null)
        {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
    }
}
