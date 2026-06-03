// Last updated: 6/3/2026, 6:01:44 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int n1=nums1.length;
4        int n2=nums2.length;
5        int res[]=new int[n1];
6        res[n1-1]=-1;
7        // int in=0;
8        // boolean f=true;
9        // for(int i=0;i<n1;i++){
10        //     int g=nums1[i];
11        //     for(int j=0;j<n2;j++){
12        //         if(g==nums2[j]){
13        //             for(int k=j+1;k<n2;k++){
14        //                 if(g<nums2[k]){
15        //                     f=false;
16        //                     res[in++]=nums2[k];
17        //                     break;
18        //                 }
19        //             }
20        //             if(f)
21        //              res[in++]=-1;
22        //         }
23        //         f=true;
24        //     }
25        // }
26        Stack<Integer> s1=new Stack<>();
27        Stack<Integer> s2=new Stack<>();
28        for(int i=0;i<n2;i++){
29            s1.push(nums2[i]);
30        }
31        for(int i=0;i<n2;i++){
32            s2.push(s1.pop());
33        }
34        for(int i=0;i<n1;i++){
35            int g=nums1[i];
36            while(!s2.isEmpty()){
37                int k=s2.pop();
38                s1.push(k);
39                if(k==g){
40                    if(s2.isEmpty()){
41                        res[i]=-1;
42                    }else{
43                    while(!s2.isEmpty()){
44                        int u=s2.pop();
45                        s1.push(u);
46                        if(u>k){
47                            res[i]=u;
48                            break;
49                        }
50                    }
51                    if(res[i]==0)
52                    res[i]=-1;
53                    }
54                   
55                }
56            }
57            while(!s1.isEmpty()){
58                s2.push(s1.pop());
59            }
60            
61
62        }
63        return res;
64    }
65}