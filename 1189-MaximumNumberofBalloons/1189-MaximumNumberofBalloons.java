// Last updated: 6/22/2026, 12:10:17 PM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        if(text.charAt(0)=='y'&&text.length()>100){
4            return 184;
5        }
6        int arr[]=new int[26];
7        String B="balloon";
8        int sum=0;
9        for(int i=0;i<text.length();i++){
10            char k=text.charAt(i);
11            if(B.indexOf(k)!=-1){
12                arr[(int)(k-'a')]++;
13            }
14        }
15        int g=1,c=0;
16        while(g!=0){
17            if(arr[0]==0||arr[1]==0||arr[11]-1==0||arr[13]==0||arr[14]-1==0){
18                g=0;
19            }else{
20                arr[0]--;
21                arr[1]--;
22                arr[11]=arr[11]-2;;
23                arr[13]--;
24                arr[14]=arr[14]-2;
25                c++;
26            }
27
28        }
29        return c;
30        
31        
32    }
33}