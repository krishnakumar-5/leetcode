class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return nums;
        }
        List<Integer> a=new ArrayList<>();
        a.add(nums[0]);
        a.add(nums[1]);
        int l=0,r=1;
        for(int i=2;i<nums.length;i++){
            if(a.get(l)>a.get(r)){
               a.add(l+1,nums[i]);
               l++;
            }else{
               a.add(nums[i]);
            }
            r++;
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=a.get(i);
        }
        return res;
    }
}