// Last updated: 3/16/2026, 11:24:07 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set=new HashSet<>();
4        Set<Integer> set1=new HashSet<>();
5        for(int num:nums1){
6            set.add(num);
7        }
8        for(int num:nums2){
9            if(set.contains(num)){
10                set1.add(num);
11            }
12        }
13        int res[]=new int[set1.size()];
14        int index=0; 
15        for(int num:set1){
16            res[index++]=num;
17        }
18        return res;  
19    }
20}