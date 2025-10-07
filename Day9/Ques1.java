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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode temp = head;
        ListNode prev = head.next;
        ListNode newHead = head;
        ListNode newHeadPointer = head;

        while(prev!=null){
            if(prev.val!=temp.val){
                newHeadPointer.next = prev; 
                newHeadPointer = newHeadPointer.next;
            }
            prev = prev.next;
            temp=temp.next;
        }
        newHeadPointer.next = null;
        return newHead;
    }
}