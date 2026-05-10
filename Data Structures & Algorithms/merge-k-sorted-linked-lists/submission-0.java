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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ListNode mergedLists = mergeTwo(lists[0], lists[1]);
        for(int i=2; i<lists.length; i++) {
            mergedLists = mergeTwo(mergedLists, lists[i]);
        }
        return mergedLists;
    }

    public ListNode mergeTwo(ListNode a, ListNode b) {
        ListNode result = new ListNode();
        ListNode curr = result;
        while(a != null && b != null) {
            if(a.val < b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }

        if(a == null) curr.next = b;
        if(b == null) curr.next = a;
        return result.next;
    }
}
