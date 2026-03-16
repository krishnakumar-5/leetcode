// Last updated: 3/16/2026, 10:30:02 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set=new HashSet<>();
4        for(int num:nums){
5            if(!set.add(num))
6            return true;
7        }
8        return false;
9       
10    }
11}