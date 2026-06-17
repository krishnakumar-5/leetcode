// Last updated: 6/17/2026, 2:19:25 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3       int m = nums1.length;
4       int n = nums2.length;
5       int f = m+n;
6       int m1 = (f-1)/2;
7       int m2 = (f)/2;
8       int count =0;
9       int a = 0;
10       int b = 0;
11       int pre=0,cur = 0;
12       while(count<=m2)
13       {
14        pre = cur;
15        if(a < m && (b>=n||nums1[a]<=nums2[b]))
16        {
17            cur=nums1[a++];
18
19        }
20        else
21        {
22            cur=nums2[b++];
23        }
24        count++;
25       }
26       if(f%2==0)
27       {
28        return (pre+cur)/2.0;
29       }
30       else
31       {
32        return cur;
33       }
34    }
35}