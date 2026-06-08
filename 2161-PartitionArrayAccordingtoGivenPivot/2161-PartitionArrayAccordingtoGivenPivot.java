// Last updated: 6/8/2026, 10:39:26 AM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        Deque<Integer> s=new ArrayDeque<>();
4        Deque<Integer> b=new ArrayDeque<>();
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]<pivot){
7                s.offer(nums[i]);
8            }else if(nums[i]==pivot){
9                b.offerFirst(nums[i]);
10            }else{
11                b.offer(nums[i]);
12            }
13        }
14        int index=0;
15        while(!s.isEmpty()){
16            nums[index++]=s.poll();
17        }
18        while(!b.isEmpty()){
19            nums[index++]=b.poll();
20        }
21        return nums;
22        
23       
24    }
25}