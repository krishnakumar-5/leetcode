// Last updated: 2/13/2026, 10:18:10 AM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        if(nums[0]==1){
                return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                count++;
                return nums[i]+1;
            }
        }
        if(count==0){
            return nums[nums.length-1]+1;
        }
        return 0;
    }
}