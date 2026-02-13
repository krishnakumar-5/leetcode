// Last updated: 2/13/2026, 10:18:29 AM
class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        if(x<0){
            return false;
        }else{
            int d,res=0;
            while(x!=0){
                d=x%10;
                res=res*10+d;
                x=x/10;  
            }
            if(t==res){
                return true;
            }else{
                return false;
            }
        }
        
    }
}