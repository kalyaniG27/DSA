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
    public void reorderList(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       } ListNode second = slow.next;
         slow.next = null;
         ListNode curr = second;
         ListNode prev = null;
         ListNode next = null;
         while (curr != null){
         next = curr.next;
         curr.next = prev;
         prev = curr;
curr = next;}
ListNode first = head;
//ListNode second = prev;
second = prev;
while(second!=null){
    
 
ListNode firstNext = first.next;
ListNode secondNext = second.next;
first.next = second;
second.next = firstNext;
first = firstNext;
second = secondNext;

}
    }
}