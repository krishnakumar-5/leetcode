// Last updated: 6/17/2026, 10:26:24 PM
class Solution {
    public String multiply(String num1, String num2) {
        String s1 = reverse(num1);
        String s2 = reverse(num2);
        char[] n1 = s1.toCharArray();
        char[] n2 = s2.toCharArray();
        int[] res = new int[s1.length() + s2.length()];

        for(int i= 0; i<n1.length; i++){

                int resIndex = i;
                int a = n1[i] - '0';
                int carry = 0;

            for(int j=0; j<n2.length; j++){
                
                int b = n2[j] - '0';
                int sum = a*b + res[resIndex];
                res[resIndex++] = sum%10;
                carry = sum / 10;
                if(carry!=0)
                    res[resIndex] = res[resIndex]+ carry;
                }
            }
            String result ="";

            int m=res.length-1;
            while(m>=0 && res[m]==0)
                    m--;
            for(int i = m; i>=0; i--){
                result = result + res[i];
            }
            
        if(m<0)
            return "0";
        return result;
        }


    private String reverse(String s){
        int right = s.length()-1;
        String rev="";

        while(right>=0){
            rev = rev + s.charAt(right);
            right--;
        }

        return rev;
    }
}
