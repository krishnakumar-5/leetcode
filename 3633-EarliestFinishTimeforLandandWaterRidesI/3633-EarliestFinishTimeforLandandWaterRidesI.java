// Last updated: 6/2/2026, 12:06:48 PM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration,int[] waterStartTime, int[] waterDuration) {
3
4        int n = landStartTime.length;
5        int m = waterStartTime.length;
6        int ans = Integer.MAX_VALUE;
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < m; j++) {
9                int landFinish = landStartTime[i] + landDuration[i];
10                int waterBegin = Math.max(landFinish, waterStartTime[j]);
11                ans = Math.min(ans, waterBegin + waterDuration[j]);
12
13                int waterFinish = waterStartTime[j] + waterDuration[j];
14                int landBegin = Math.max(waterFinish, landStartTime[i]);
15                ans = Math.min(ans, landBegin + landDuration[i]);
16            }
17        }
18        return ans;
19    }
20}