// Last updated: 5/25/2026, 4:09:48 PM
1import java.util.*;
2class Solution {
3    public int findKthLargest(int[] nums, int k) {
4        PriorityQueue<Integer> q=new PriorityQueue<>();
5        for(int num:nums){
6            q.offer(num);
7            if(q.size()>k)
8                q.poll();
9        }
10        return q.peek();
11    }
12}