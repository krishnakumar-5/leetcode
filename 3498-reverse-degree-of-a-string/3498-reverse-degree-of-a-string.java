class Solution {
    public int reverseDegree(String s) {
        int r=0;
        for(int i=0;i<s.length();i++){
            int d=(i+1)*(26-(s.charAt(i)-'a'));
            r+=d;
        }
        return r;
    }
}