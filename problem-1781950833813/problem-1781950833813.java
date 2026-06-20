// Last updated: 6/20/2026, 3:50:33 PM
1import java.math.*;
2class Solution {
3    public String addStrings(String num1, String num2) {
4        BigInteger n=new BigInteger(num1);
5        BigInteger m=new BigInteger(num2);
6        BigInteger res=n.add(m);
7        return String.valueOf(res);
8
9    }
10}