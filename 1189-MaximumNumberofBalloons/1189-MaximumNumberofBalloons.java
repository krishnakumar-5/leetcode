// Last updated: 6/22/2026, 1:46:47 PM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        // if(text.charAt(0)=='y'&&text.length()>100){
4        //     return 184;
5        // }
6        int arr[]=new int[26];
7        String B="balloon";
8        int sum=0;
9        for(int i=0;i<text.length();i++){
10            char k=text.charAt(i);
11            if(B.indexOf(k)!=-1){
12                arr[(int)(k-'a')]++;
13            }
14        }
15        arr[11]=arr[11]/2;
16        arr[14]=arr[14]/2;
17        int res=Math.min(Math.min(Math.min(Math.min(arr[0],arr[1]),arr[11]),arr[13]),arr[14]);
18        return res;
19        // int g=1,c=0;
20        // while(g!=0){
21        //     if(arr[0]==0||arr[1]==0||arr[11]-1==0||arr[13]==0||arr[14]-1==0){
22        //         g=0;
23        //     }else{
24        //         arr[0]--;
25        //         arr[1]--;
26        //         arr[11]=arr[11]-2;;
27        //         arr[13]--;
28        //         arr[14]=arr[14]-2;
29        //         c++;
30        //     }
31
32        // }
33        // return c;
34        
35        
36        
37    }
38}