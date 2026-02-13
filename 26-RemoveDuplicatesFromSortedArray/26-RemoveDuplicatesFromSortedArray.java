// Last updated: 2/13/2026, 10:18:27 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     set.add(num);
        // } 
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<=nums.length-1;j++){
        //         if(nums[i]==nums[j]){
        //             nums[i]=nums[j];
        //         }
        //     }
        // }
        // return set.size();
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
}
   