// Last updated: 6/3/2026, 6:19:38 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int n1=nums1.length;
4        int n2=nums2.length;
5        for(int i=0;i<n1;i++){
6            int g=nums1[i];
7            for(int j=0;j<n2;j++){
8                if(g==nums2[j]){
9                    for(int k=j+1;k<n2;k++){
10                        if(g<nums2[k]){
11                            nums1[i]=nums2[k];
12                            break;
13                        }
14                    }
15                    if(nums1[i]==g)
16                     nums1[i]=-1;
17                }
18            }
19        }
20        // Stack<Integer> s1=new Stack<>();
21        // Stack<Integer> s2=new Stack<>();
22        // for(int i=0;i<n2;i++){
23        //     s1.push(nums2[i]);
24        // }
25        // for(int i=0;i<n2;i++){
26        //     s2.push(s1.pop());
27        // }
28        // for(int i=0;i<n1;i++){
29        //     int g=nums1[i];
30        //     while(!s2.isEmpty()){
31        //         int k=s2.pop();
32        //         s1.push(k);
33        //         if(k==g){
34        //             if(s2.isEmpty()){
35        //                 res[i]=-1;
36        //             }else{
37        //             while(!s2.isEmpty()){
38        //                 int u=s2.pop();
39        //                 s1.push(u);
40        //                 if(u>k){
41        //                     res[i]=u;
42        //                     break;
43        //                 }
44        //             }
45        //             if(res[i]==0)
46        //             res[i]=-1;
47        //             }
48                   
49        //         }
50        //     }
51        //     while(!s1.isEmpty()){
52        //         s2.push(s1.pop());
53        //     }
54            
55
56        // }
57        return nums1;
58    }
59}