// Last updated: 6/20/2026, 2:11:06 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> res=new LinkedList<>();
4        if(nums.length==0){
5            return res;
6        }
7        int start=nums[0];
8        for(int i=0;i<nums.length;i++){
9            if(i!=nums.length-1&&nums[i]+1==nums[i+1]){
10                continue;
11            }else{
12                if(nums[i]==start){
13                    res.add(String.valueOf(nums[i]));
14                }else{
15                    res.add(String.valueOf(start)+"->"+String.valueOf(nums[i]));
16                }
17                if(i!=nums.length-1)
18                    start=nums[i+1];
19            }
20        }
21        return res;
22    }
23}