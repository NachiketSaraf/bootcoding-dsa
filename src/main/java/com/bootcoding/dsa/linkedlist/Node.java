package com.bootcoding.dsa.linkedlist;

public class Node {
    int data;
    Node next;

    public Node(int d)
    {
        data = d;

    }

//    public static void main(String[] args) {
//        createLinkedList();
//        printLinkedList(createLinkedList());
//
//    }
//    //creating new Linked List
//    public static Node createLinkedList()
//    {
//        Node firstNode = new Node(10);
//        Node secondNode = new Node(20);
//        Node thirdNode = new Node(30);
//        Node forthNode = new Node(40);
//
//        Node head = firstNode;
//        head.next = secondNode;
//        secondNode.next = thirdNode;
//        thirdNode.next = forthNode;
//        forthNode.next = null;
//        return head;
//    }
    //Printing lists of nodes
//    public static void printLinkedList(Node head)
//    {
//        Node temp = head;
//        while (temp != null)
//        {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }

//    //Inserting first node in list
//    public static Node firstInsert(Node head)
//    {
//        Node newNode = new Node(70);
//        newNode.next=head;
//        head=newNode;
//        return head;
//    }
//    //Inserting last node in list
//    public static void lastInsertNode(Node head)
//    {
//        Node temp = head;
//        Node newNode = new Node(50);
//        System.out.println(head);
//        while (temp.next != null)
//        {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//    //Deleting first node in list
//    public static void deleteFirstNode(Node head)
//    {
//        head = head.next;
//        printLinkedList(head);
//    }
//    //deleting last node in list
//    public static void deleteLastNode(Node head)
//    {
//        Node temp = head;
//        while (temp != null)
//        {
//            System.out.println(temp.data);
//            if (temp.next.next == null)
//            {
//                temp.next = null;
//            }
//            temp = temp.next;
//        }
//    }

}
