// Last updated: 3/24/2026, 10:17:51 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null || head.next == null) return head;
        //algorithm:
        // 1. add dump head as group.prev
        // 2. find kth node 
        // 3. k+1th is group.next
        // 4. reverse between group.prev and group.next (execlusive both)
        // 5. return the 1st kth 

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = getKth(groupPrev, k);
            if (kth == null) break;

            groupPrev = reverseGroup(groupPrev, kth);
        }

        return dummy.next;
    }

   private ListNode getKth(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    // Reverses the group between groupPrev.next and kth (inclusive)
    // Returns the new groupPrev for the next group,
    // which is the old head of this group after reversal
    private ListNode reverseGroup(ListNode groupPrev, ListNode kth) {
        ListNode groupNext = kth.next;

        ListNode prev = groupNext;
        ListNode curr = groupPrev.next;

        while (curr != groupNext) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode newGroupTail = groupPrev.next; // old head
        groupPrev.next = kth;                   // new head

        return newGroupTail;
    }
        
}