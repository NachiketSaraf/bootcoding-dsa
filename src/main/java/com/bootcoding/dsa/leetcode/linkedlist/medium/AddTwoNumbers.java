package com.bootcoding.dsa.leetcode.linkedlist.medium;

import com.bootcoding.dsa.leetcode.linkedlist.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode ansTemp = ans;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            ListNode dummy = new ListNode(sum%10);
            ansTemp.next = dummy;
            ansTemp = ansTemp.next;
        }
        return ans.next;
    }
}
