// Last updated: 2/13/2026, 10:17:45 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
              int k=nums[i];
              while(k!=0){
                int d=k%10;
                sum2+=d;
                k/=10;
              }
            }else{
                sum2+=nums[i];
            }
        }
        int res=sum-sum2;
        return res;
    }
}