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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int res[] = { -1, -1 };
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head.next;
        ListNode prev = head;
        ListNode next = temp.next;
        int lmax = 0, lmin = 0, c = 1;
        while (temp.next != null) {
            int pd = prev.val;
            int td = temp.val;
            int nd = next.val;
            c++;
            if ((pd > td && nd > td) || (pd < td && nd < td)) {
                li.add(c);
            }
            prev = temp;
            temp = next;
            next = temp.next;
        }
        if (li.size() < 2)
            return res;
        res[1] = (li.get(li.size() - 1) - li.get(0));
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < li.size() ; i++) {
            min = Math.min(min,(li.get(i) - li.get(i - 1)));
        }
        res[0] = min;
        return res;

    }
}