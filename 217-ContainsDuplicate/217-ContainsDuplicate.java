// Last updated: 3/16/2026, 10:28:27 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set=new HashSet<>();
4        for(int num:nums){
5            set.add(num);
6        }
7        if(set.size()!=nums.length){
8            return true;
9        }
10        return false;
11    }
12}