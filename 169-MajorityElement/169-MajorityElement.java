// Last updated: 3/7/2026, 4:22:57 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count=0;
4        int candidate=0;
5        for(int i=0;i<nums.length;i++){
6            if(count==0){
7                candidate=nums[i];
8            }
9            if(nums[i]==candidate){
10                count++;
11            }else{
12                count--;
13            }
14        }
15        int freq=0;
16        for(int i=0;i<nums.length;i++){
17            if(nums[i]==candidate){
18                freq++;
19            }
20        }
21        if(freq>nums.length/2){
22            return candidate;
23        }else{
24            return -1;
25        }
26    }
27}