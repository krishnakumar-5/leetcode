class Solution {
    public int digitFrequencyScore(int n) {
        int freq[]=new int[10];
        while(n!=0){
            freq[n%10]++;
            n/=10;
        }
        int ans=0;
        for(int i=0;i<10;i++){
            if(freq[i]!=0){
                ans+=freq[i]*i;
            }
        }
        return ans;
    }
}