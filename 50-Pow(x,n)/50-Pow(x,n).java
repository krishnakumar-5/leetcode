// Last updated: 6/17/2026, 10:25:57 PM
1import java.math.*;
2class Solution {
3    public String multiply(String num1, String num2) {
4        BigInteger k=new BigInteger(num1);
5        BigInteger g=new BigInteger(num2);
6        BigInteger h=k.multiply(g);
7        return String.valueOf(h);
8    }
9}