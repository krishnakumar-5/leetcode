// Last updated: 2/13/2026, 10:18:23 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                c++;
                return i;
            }
        }
        int res[]=new int[nums.length+1];
        if(c==0){
            for(int i=0;i<nums.length;i++){
                res[i]=nums[i];
            }
            for(int i=nums.length;i<nums.length+1;i++){
                res[i]=target;
            }
            Arrays.sort(res);
            for(int i=0;i<nums.length+1;i++){
                if(res[i]==target){
                    return i;
                }
            }
        }
        return 0;
    }
}