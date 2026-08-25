class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int in=1;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                if(prev!=nums[i]){
                if(k*in!=nums[i]){
                    return k*in;
                }else{
                    in++;
                    prev=nums[i];
                }
                }
            }
        }
        return k*in;
    }
}