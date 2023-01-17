package com.bootcoding.dsa.linkedlist;

public class DuplicateInLinkedList {
    public static void main(String[] args) {
        Node firstnode = new Node(3);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(2);
        Node forthnode = new Node(3);
        Node fifthnode = new Node(5);

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

        while (temp.next!=null){
            Node temp2 = temp.next;
            while (temp2!=null){
                if (temp.data== temp2.data){
                    System.out.println(temp.data);
                }
                temp2 = temp2.next;
            }temp2 = head;
            temp = temp.next;
        }

}

}
