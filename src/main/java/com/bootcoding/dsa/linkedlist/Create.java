package com.bootcoding.dsa.linkedlist;

public class Create {
    public static void main(String[] args) {

        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);


        Node head = firstNode;
        head.next= secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;

        Node temp = head;

        while (temp!= null){
            System.out.println(temp.data);
            temp= temp.next;
        }

    }
}
