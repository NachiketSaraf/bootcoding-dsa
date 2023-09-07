package com.bootcoding.dsa.leetcode.linkedlist.medium;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;

public class SplitLinkedListParts {
    public static void main(String[] args) {
        ListNode firstnode = new ListNode(1);
        ListNode secondnode = new ListNode(2);
        ListNode thirdnode = new ListNode(6);
        ListNode forthnode = new ListNode(3);
        ListNode fifthnode = new ListNode(4);
        ListNode sixthnode = new ListNode(5);
        ListNode seventhnode = new ListNode(6);

        ListNode head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode.next= sixthnode;
        sixthnode.next= seventhnode;
        seventhnode.next = null;

        ListNode[] listNodes = splitListToParts(head, 2);

        for (ListNode l: listNodes) {
            System.out.println(l.val);
        }
    }
    public static ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int partSize = len/k;
        int extra =len%k;

        int indx = 0;
        ListNode[] ans = new ListNode[k];
        ListNode prev = null;
        temp =head;
        while (temp != null){
            ans[indx++]= temp;
            for (int i = 0 ; i<partSize ;i++){
                prev = temp;
                temp = temp.next;
            }
            if (extra != 0 && temp != null){
                extra--;
                prev = temp;
                temp = temp.next;
            }
            if (prev != null){
                 prev.next =null;
            }
            while (ans.length != k){
                ans[indx++] = null;
            }

        }
        return ans;
    }
}
//    int len = 0;
//    ListNode temp = head;
//        while(temp != null){
//                len++;
//                temp = temp.next;
//                }
//                int partSize = len/k;
//                int extra =len%k;
//
//                int indx = 0;
//                ListNode[] ans = new ListNode[k];
//                ListNode prev = null;
//                temp =head;
//                while (temp != null){
//                int eachPart = partSize;
//                ans[indx++]= temp;
//                while (eachPart > 0){
//                prev = temp;
//                temp = temp.next;
//                eachPart--;
//                }
//
//                if (extra != 0 && temp != null){
//                extra--;
//                prev = temp;
//                temp = temp.next;
//                }
//                if (prev != null){
//                prev.next =null;
//                }
//                while (ans.length != k){
//                ans[indx++] = null;
//                }
//
//                }
//                return ans;
