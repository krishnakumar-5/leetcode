// Last updated: 6/30/2026, 6:26:03 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Arrays.sort(nums);
4        int num=1;
5        boolean flag=true;
6        Set<Integer> set=new LinkedHashSet<>();
7        for(int i=0;i<nums.length;i++){
8            if(!set.add(nums[i])){
9                continue;
10            }
11            if(nums[i]>0){
12                if(nums[i]==num){
13                    num++;
14                }else{
15                    return num;
16                }
17                flag=false;
18            }
19        }
20        if(!flag)
21        return nums[nums.length-1]+1;
22        return 1;
23    }
24}