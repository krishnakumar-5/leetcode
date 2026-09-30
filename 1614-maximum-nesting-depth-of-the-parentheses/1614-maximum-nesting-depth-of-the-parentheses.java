class Solution {
    public int maxDepth(String s) {
        int l=0,r=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
                if(max<(l-r)){
                    max=l-r;
                }
            }else if(s.charAt(i)==')'){
                r++;
            }
        }
        return max;
    }
}