// Last updated: 6/4/2026, 8:56:43 PM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        if(num1<100&&num2<100){
4            return 0;
5        }
6        int c=0;
7        for(int i=num1;i<=num2;i++){
8            int d=i;
9            if(i>=100&&i<=999){
10                int f=d/100;
11                int l=d%10;
12                d/=10;
13                int mid=d%10;
14                if(mid>f&&mid>l){
15                    c++;
16                }else if(mid<f&&mid<l){
17                    c++;
18                }
19                
20            }else if(i>=1000&&i<=9999){
21                int f=d/1000;
22                int l=d%10;
23                d/=10;
24                int mid2=d%10;
25                d/=10;
26                int mid1=d%10;
27                if(mid1>f&&mid1>mid2){
28                    c++;
29                }else if(mid1<f&&mid1<mid2){
30                    c++;
31                }
32                if(mid2>mid1&&mid2>l){
33                    c++;
34                }else if(mid2<mid1&&mid2<l){
35                    c++;
36                }
37            }else if(i>=10000&&i<=99999){
38                int f=d/10000;
39                int l=d%10;
40                d/=10;
41                int mid3=d%10;
42                d/=10;
43                int mid2=d%10;
44                d/=10;
45                int mid1=d%10;
46                if(mid1>f&&mid1>mid2){
47                    c++;
48                }else if(mid1<f&&mid1<mid2){
49                    c++;
50                }
51                if(mid2>mid1&&mid2>mid3){
52                    c++;
53                }else if(mid2<mid1&&mid2<mid3){
54                    c++;
55                }
56                if(mid3>mid2&&mid3>l){
57                    c++;
58                }else if(mid3<mid2&&mid3<l){
59                    c++;
60                }
61
62            }else if(i>=100000){
63
64            }
65        }
66        return c;
67    }
68}