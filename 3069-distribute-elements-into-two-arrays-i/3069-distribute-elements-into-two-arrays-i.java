class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return nums;
        }
        List<Integer> a=new LinkedList<>();
        List<Integer> b=new LinkedList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        int ia=0,ib=0;
        for(int i=2;i<nums.length;i++){
            if(a.get(ia)>b.get(ib)){
                a.add(nums[i]);
                ia++;
            }else{
                b.add(nums[i]);
                ib++;
            }
        }
        int res[]=new int[nums.length];
        int ind=0;
        for(int i=0;i<a.size();i++){
            res[ind++]=a.get(i);
        }
        for(int i=0;i<b.size();i++){
            res[ind++]=b.get(i);
        }
        return res;
    }
}