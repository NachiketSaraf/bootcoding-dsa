package com.bootcoding.dsa.recursion;

import com.bootcoding.dsa.linkedlist.Node;

public class LinkedList {
    public static void main(String[] args) {
        Node head =Node.createLinkedList();
        print(head);
    }
    public static void print(Node head){
        Node temp = head;
        if (temp == null){
            return;
        }
        System.out.println(temp.data);
        print(temp.next);
    }
}
