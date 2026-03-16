// Last updated: 3/16/2026, 10:27:41 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set=new LinkedHashSet<>();
4        for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6        }
7        if(set.size()!=nums.length){
8            return true;
9        }
10        return false;
11    }
12}