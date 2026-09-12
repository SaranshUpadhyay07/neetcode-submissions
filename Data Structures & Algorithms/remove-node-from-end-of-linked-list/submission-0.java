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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int s = length(head)-n+1;
        if(s == 1) return head.next;
        ListNode curr = head;
        int i = 1;
        while(i < s-1){
            i++;
            curr = curr.next;
        }

        if(curr.next != null)curr.next = curr.next.next;
        return head;
    }
    int length(ListNode root){
        int i = 0;

        while(root != null){
            i++;
            root = root.next;
        }

        return i;
    }
}
