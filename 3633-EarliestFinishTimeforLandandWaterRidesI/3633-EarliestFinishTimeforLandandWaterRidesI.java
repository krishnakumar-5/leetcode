// Last updated: 6/2/2026, 12:04:09 PM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration,int[] waterStartTime, int[] waterDuration) {
3
4        int n = landStartTime.length;
5        int m = waterStartTime.length;
6
7        int ans = Integer.MAX_VALUE;
8
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j < m; j++) {
11
12                int landFinish = landStartTime[i] + landDuration[i];
13                int waterBegin = Math.max(landFinish, waterStartTime[j]);
14                ans = Math.min(ans, waterBegin + waterDuration[j]);
15
16                int waterFinish = waterStartTime[j] + waterDuration[j];
17                int landBegin = Math.max(waterFinish, landStartTime[i]);
18                ans = Math.min(ans, landBegin + landDuration[i]);
19            }
20        }
21
22        return ans;
23    }
24}