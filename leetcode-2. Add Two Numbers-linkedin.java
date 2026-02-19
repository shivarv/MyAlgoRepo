/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode temp = null;
        int carry = 0;
        int val = 0;
        while(l1 != null && l2 != null) {
            ListNode myTemp = new ListNode();
            val = l1.val + l2.val + carry;
            myTemp.val = val % 10;
            carry = val / 10;
            if(temp == null) {
                temp = myTemp;
                l3 = temp;
            } else {
                temp.next = myTemp;
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            ListNode myTemp = new ListNode();
            val = l1.val + carry;
            myTemp.val = val % 10;
            carry = val / 10;
            if(temp == null) {
                temp = myTemp;
                l3 = temp;
            } else {
                temp.next = myTemp;
                temp = temp.next;
            }
            l1 = l1.next;
        }
        while(l2 != null) {
            ListNode myTemp = new ListNode();
            val = l2.val + carry;
            myTemp.val = val % 10;
            carry = val / 10;
            if(temp == null) {
                temp = myTemp;
                l3 = temp;
            } else {
                temp.next = myTemp;
                temp = temp.next;
            }
            l2 = l2.next;
        }
        if(carry != 0) {
            ListNode myTemp = new ListNode();
            myTemp.val = carry;
            if(temp == null) {
                temp = myTemp;
                l3 = temp;
            } else {
                temp.next = myTemp;
            }
        }
        return l3;

    }
}