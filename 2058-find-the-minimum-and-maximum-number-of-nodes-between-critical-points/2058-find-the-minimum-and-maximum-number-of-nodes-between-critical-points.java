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
        int c = 1;
        while (temp.next != null) {
            c++;
            if ((prev.val > temp.val && temp.next.val > temp.val) || (prev.val < temp.val && temp.next.val < temp.val)) {
                li.add(c);
            }
            prev = temp;
            temp = temp.next;
        }
        if (li.size() < 2)
            return res;
        res[1] = (li.get(li.size() - 1) - li.get(0));
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < li.size() ; i++) {
            if(min>(li.get(i)-li.get(i-1))){
                min=(li.get(i) - li.get(i - 1));
            }
        }
        res[0] = min;
        return res;

    }
}