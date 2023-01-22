package com.bootcoding.dsa.codingtestseries;

public class SecondLastElementLinkedList {
    public static void main(String[] args) {
        Node firstnode = new Node(1);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(3);
        Node forthnode = new Node(5);
        Node fifthnode = new Node(6);

        Node head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode = null;

        int val = secondLastElement(head);
        System.out.println(val);
    }

    private static int secondLastElement(Node head) {
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for (int i = count-1 ; i>0;i--){
            temp = temp.next;
        }
        return temp.data;
    }
}
