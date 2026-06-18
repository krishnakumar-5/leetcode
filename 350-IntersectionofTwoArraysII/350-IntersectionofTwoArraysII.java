// Last updated: 6/18/2026, 10:13:18 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        int nums[]=new int[10000];
4        int n1=nums1.length;
5        int n2=nums2.length;
6        LinkedList<Integer> l=new LinkedList<>();
7        if(n1>n2){
8            for(int i=0;i<n1;i++){
9                nums[nums1[i]]++;
10            }
11            for(int i=0;i<n2;i++){
12                if(nums[nums2[i]]!=0){
13                    l.add(nums2[i]);
14                    nums[nums2[i]]--;
15                }
16            }
17        }else{
18            for(int i=0;i<n2;i++){
19                nums[nums2[i]]++;
20            }
21            for(int i=0;i<n1;i++){
22                if(nums[nums1[i]]!=0){
23                    l.add(nums1[i]);
24                    nums[nums1[i]]--;
25                }
26            }
27
28        } 
29        int res[]=new int[l.size()];
30        for(int i=0;i<res.length;i++){
31            res[i]=l.get(i);
32        }
33        return res;
34        
35    }
36}