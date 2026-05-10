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
        Stack<ListNode> nodes = new Stack<>();
        ListNode curr = head;
        while(curr != null) {
            nodes.push(curr);
            curr = curr.next;
        }
        Stack<ListNode> nodes2 = new Stack<>();
        while(n != 1) {
            nodes2.push(nodes.pop());
            n--;
        }
        ListNode toRemove = nodes.pop();
        if(!nodes.isEmpty()) {
            nodes.pop().next = toRemove.next;
            return head;
        } 
        if(!nodes2.isEmpty()) return nodes2.pop();
        return null;
        
    }
}
