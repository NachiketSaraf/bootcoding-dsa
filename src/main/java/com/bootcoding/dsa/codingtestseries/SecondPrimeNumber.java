package com.bootcoding.dsa.codingtestseries;

public class SecondPrimeNumber {
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
        printSecondPrime(head);

    }

    private static void printSecondPrime(Node head) {
        Node temp = head;
        int evenCounter = 2;

        while (temp!=null){
            if (temp.data%2==0){
                if (evenCounter==1){
                    System.out.println(temp.data);
                }
                evenCounter--;
            }
            temp=temp.next;
        }

    }

}