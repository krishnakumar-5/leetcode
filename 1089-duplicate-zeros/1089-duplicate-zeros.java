class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int j=i+1;
                int zero=0;
                while(j<arr.length){
                    int temp=arr[j];
                    arr[j]=zero;
                    zero=temp;
                    j++;
                }
                i++;
            }
        }
    }
}