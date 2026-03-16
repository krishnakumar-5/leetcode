// Last updated: 3/16/2026, 11:21:11 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set=new HashSet<>();
4        Set<Integer> set1=new HashSet<>();
5        Set<Integer> res=new HashSet<>();
6        for(int num:nums1){
7            set.add(num);
8        }
9        for(int num:nums2){
10            set1.add(num);
11        }
12        for(int num:set){
13            if(set1.contains(num)){
14                res.add(num);
15            }
16        } 
17        int resu[]=new int[res.size()];
18        int index=0; 
19        for(int num:res){
20            resu[index++]=num;
21        }
22        return resu;  
23    }
24}