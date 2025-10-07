import java.util.*;
class Solution {
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode n=temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode end=head.next;
        while(end.next!=null && end.next.next!=null){
            slow=slow.next;
            end=end.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode newhead=newHead;
        ListNode temp=newHead;
        slow=head;
        while(temp!=null){
            if(temp.val!=slow.val){
                reverse(newhead);
                return false;
            }
            else{
                temp=temp.next;
                slow=slow.next;
            }
        }
        reverse(newhead);
        return true;
    }
}