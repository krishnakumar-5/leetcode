// Last updated: 2/13/2026, 10:18:13 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new LinkedHashSet();  
        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
        }
        return false; 
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<=nums.length-1;j++){
        //      if(nums[i]==nums[j]){
        //         count++;
        //      }
        //     }
        // }
        // if(count==0){
        //     return false;
        // }else{
        //     return true;
        // }
    }
}