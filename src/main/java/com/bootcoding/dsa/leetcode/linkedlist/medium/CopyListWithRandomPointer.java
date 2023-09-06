package com.bootcoding.dsa.leetcode.linkedlist.medium;


public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        Node n =new Node(7);
        Node n1 =new Node(13);
        Node n2 =new Node(11);
        Node n3 =new Node(10);
        Node n4 =new Node(1);

        Node head = n;
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next=null;

        head.random = null;
        n1.random = n;
        n2.random=n4;
        n3.random = n2;
        n4.random = n;
        printLL(head);
        Node deepCopy= copyRandomList(head);
        System.out.println("deep copy");
        printLL(deepCopy);
    }

    private static void printLL(Node head) {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.val);
            if (temp.random != null) {
                System.out.println(temp.random.val);
            }
            temp = temp.next;
        }
    }

    public static Node copyRandomList(Node head) {
        Node iter = head;
        Node front = head;

        // 1 creating copy and inserting between original LL
        while (iter != null){
            front = iter.next;

            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;

            iter = front;
        }
        // 2 pointing random pointer
        iter =head;

        while (iter != null){
            if (iter.random != null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        Node dummy = new Node(0);
        Node copyLL = dummy;

        while (iter != null){
            front = iter.next.next;

            copyLL.next = iter.next;
            copyLL = copyLL.next;

            iter.next = front;

            iter = front;
        }
        return dummy.next;
    }
}
