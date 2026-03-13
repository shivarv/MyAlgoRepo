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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = null;
        ListNode head = null;
        ListNode leftOverList = null;
        while(list1 != null && list2 != null) {
            ListNode element;
            if(list1.val < list2.val) {
                element = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                element = new ListNode(list2.val);
                list2 = list2.next;
            }
            if(list3 == null) {
                list3 = element;
                head = list3;
            } else {
                
                list3.next = element;
                list3 = list3.next;
            }
        }

        leftOverList = list1 != null? list1: list2;
        while(leftOverList != null) {
            if(list3 == null) {
                list3 = new ListNode(leftOverList.val);
                head = list3;
            } else {
                 list3.next = new ListNode(leftOverList.val);
                             list3 = list3.next;
            }
            leftOverList = leftOverList.next;
        }
        return head;
    }
}