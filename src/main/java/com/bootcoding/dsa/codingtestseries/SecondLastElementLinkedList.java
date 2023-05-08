package com.bootcoding.dsa.codingtestseries;

public class SecondLastElementLinkedList {
    public static void main(String[] args) {
        Node firstnode = new Node(1);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(3);
        Node forthnode = new Node(5);
        Node fifthnode = new Node(6);

        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        int val = secondLastElement(firstnode);
        System.out.println(val);
    }

    private static int secondLastElement(Node head) {
        Node tmp = head;
        int count = 0;
        while (tmp!=null){
            count++;
            tmp = tmp.next;
        }
        tmp = head;
        for (int i = count-1 ; i>0 ; i--) tmp = tmp.next;
        return tmp.data;
    }
}
