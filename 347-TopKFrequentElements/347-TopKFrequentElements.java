// Last updated: 6/2/2026, 9:54:10 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        int[] arr = new int[k];
4        Map<Integer,Integer> map = new LinkedHashMap<>();
5        for(int n:nums)
6        {
7            map.put(n,map.getOrDefault(n,0)+1);
8        }
9        List<Map.Entry<Integer,Integer>> li = new ArrayList<>(map.entrySet());
10        li.sort((a,b)-> b.getValue()-a.getValue());
11        for(int i=0;i<k;i++)
12        {
13           arr[i]=li.get(i).getKey();
14        }
15        return arr;
16    }
17}