// Last updated: 6/3/2026, 5:11:20 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int n1=nums1.length;
4        int n2=nums2.length;
5        int res[]=new int[n1];
6        res[n1-1]=-1;
7        int in=0;
8        boolean f=true;
9        for(int i=0;i<n1;i++){
10            int g=nums1[i];
11            for(int j=0;j<n2;j++){
12                if(g==nums2[j]){
13                    for(int k=j+1;k<n2;k++){
14                        if(g<nums2[k]){
15                            f=false;
16                            res[in++]=nums2[k];
17                            break;
18                        }
19                    }
20                    if(f)
21                     res[in++]=-1;
22                }
23                f=true;
24            }
25        }
26        return res;
27    }
28}