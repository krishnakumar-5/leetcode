// Last updated: 4/10/2026, 8:30:59 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int count=0;
4        for(int i=0;i<nums1.length;i++){
5          for(int j=count;j<nums2.length;j++){
6           if(nums1[i]==0){
7             nums1[i]=nums2[j];
8             count++;
9             break;
10           }
11          }
12        }
13        Arrays.sort(nums1);
14
15        
16    }
17}