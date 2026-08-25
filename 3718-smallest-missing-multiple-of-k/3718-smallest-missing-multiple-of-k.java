class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                set.add(nums[i]);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(k*i)){
                return k*i;
            }
        }
        return k*(nums.length+1);
    }
}