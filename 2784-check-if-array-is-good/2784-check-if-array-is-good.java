class Solution {
    public boolean isGood(int[] nums) {
        int max=Integer.MIN_VALUE;
        int freq[]=new int[201];
        if(nums.length<=1) return false;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            freq[nums[i]]++;
        }
        if(freq[max]!=2) return false;
        for(int i=1;i<max;i++){
            if(freq[i]!=1) return false;
        }
        return true;
        
    }
}