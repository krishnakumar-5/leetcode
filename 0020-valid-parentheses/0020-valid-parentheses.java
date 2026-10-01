class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if(k=='('||k=='{'||k=='['){
                st.push(k);
                flag=true;
            }
            else if((k==')'||k=='}'||k==']')&&flag){
                if(!st.isEmpty())
                {
                if((int)st.peek()+1==(int)k||(int)st.peek()+2==(int)k){
                    st.pop();
                }else{
                    return false;
                }
                }else{
                    return false;
                }
            }else{
                return false;
            }

        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}