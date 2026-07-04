// Last updated: 7/4/2026, 2:50:12 PM
1class Solution {
2    public List<String> stringMatching(String[] words) {
3        int n=words.length;
4        List<String> li=new LinkedList<>();
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                if(words[i].length()<=words[j].length()&&i!=j){
8                    if(words[j].contains(words[i])){
9                        li.add(words[i]);
10                        break;
11                    }
12                }
13            }
14        }
15        return li;
16    }
17}