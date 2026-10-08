class Solution {
    public String removeOuterParentheses(String s) {
        int l=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(l!=0){
                    res.append(s.charAt(i));
                }
                l++;
            }else{
                l--;
                if(l!=0){
                    res.append(s.charAt(i));
                }
            }
        }
        return res.toString();
    }
}