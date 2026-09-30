class Solution {
    public int maxDepth(String s) {
        int l=0,r=0,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }else if(s.charAt(i)==')'){
                r++;
            }
            if(max<(l-r)){
                max=l-r;
            }
        }
        return max;
    }
}