// Last updated: 2/13/2026, 10:18:20 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=0;
        for(int i=0;i<nums1.length;i++){
          for(int j=count;j<nums2.length;j++){
           if(nums1[i]==0){
             nums1[i]=nums2[j];
             count++;
             break;
           }
          }
        }
        Arrays.sort(nums1);

        
    }
}