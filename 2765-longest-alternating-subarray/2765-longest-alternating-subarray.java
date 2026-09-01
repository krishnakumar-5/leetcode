class Solution {
    public int alternatingSubarray(int[] nums) {
        int max=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                int j=i+1;
                boolean a=true;
                boolean b=false;
                while(j<nums.length){
                    if((nums[j]-nums[j-1]==-1)&&a){
                        b=true;
                        a=false;
                    }
                    else if((nums[j]-nums[j-1]==1)&&b){
                        a=true;
                        b=false;
                    }else{
                        break;
                    }
                    j++;
                }
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}