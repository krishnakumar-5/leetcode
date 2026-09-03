class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                c++;
            }else{
                set.add(nums[i]);
            }
        }
        int res[]=new int[2];
        res[0]=c;
        res[1]=set.size();
        return res;


    }
}