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
    public ListNode oddEvenList(ListNode head) {
        ListNode output = null;
        ListNode outputHead = null;
        ListNode copy = head;
        int i = 0;
        while(copy != null) {
            i++;
            //i++ at top so the index become 1
            //odd index
            if(i % 2 == 0) {
                copy = copy.next;
                continue;
            }
            if(output == null) {
                output = new ListNode(copy.val);
                outputHead = output;   
            } else {
                output.next = new ListNode(copy.val);
                output = output.next;
            }
            copy = copy.next;
            
        } 
        i = 0;
        copy = head;
        while(copy != null) {
            i++;
            //i++ at top so the index become 1
            //odd index
            if(i % 2 == 1) {
                copy = copy.next;
                continue;
            }
            if(output == null) {
                output = new ListNode(copy.val);
                outputHead = output;
            } else {
                output.next = new ListNode(copy.val);
                output = output.next;
            }
            copy = copy.next;
        } 
        return outputHead;       
    }
}

//optimised solution:

//idea is use evenPointer, oddPointer.
//odd pointer starts at head
//even pointer starts at head.next
//loop through evenPointer till end..make sure evenPointer and it's next is not null
//assign odd's next = even's next
//move odd next
// even's next = current odd's next
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddList;
        ListNode oddHead;
        ListNode evenList;
        ListNode evenHead;
        if(head == null || head.next == null) {
            return head;
        }
        oddList = head;
        oddHead = oddList;
        evenList = head.next;
        evenHead = evenList;
        //it has to be evenList, not odd
        while(evenList != null && evenList.next != null) {
            oddList.next = evenList.next;
            oddList = oddList.next;
            evenList.next = oddList.next;
            evenList = evenList.next;
        }
        oddList.next = evenHead;
        return oddHead;
    }
}