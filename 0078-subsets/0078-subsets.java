class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        return get(0,nums);//way one
    }
    //Way One
    public List<List<Integer>> get(int idx, int arr[]){
        if(idx == arr.length){
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            ans.add(temp);
            return ans;
        }
        List<List<Integer>> res = get(idx+1,arr);
        List<List<Integer>> mres = new ArrayList<>();
        for(List<Integer> a: res){
            mres.add(new ArrayList<>(a));
            a.add(arr[idx]);
            mres.add(new ArrayList<>(a));
        }
        return mres;
    }
}