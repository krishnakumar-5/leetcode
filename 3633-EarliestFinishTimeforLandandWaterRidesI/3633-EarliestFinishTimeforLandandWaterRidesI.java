// Last updated: 6/2/2026, 12:03:34 PM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
3                                  int[] waterStartTime, int[] waterDuration) {
4
5        int n = landStartTime.length;
6        int m = waterStartTime.length;
7
8        int ans = Integer.MAX_VALUE;
9
10        for (int i = 0; i < n; i++) {
11            for (int j = 0; j < m; j++) {
12
13                int landFinish = landStartTime[i] + landDuration[i];
14                int waterBegin = Math.max(landFinish, waterStartTime[j]);
15                ans = Math.min(ans, waterBegin + waterDuration[j]);
16
17                int waterFinish = waterStartTime[j] + waterDuration[j];
18                int landBegin = Math.max(waterFinish, landStartTime[i]);
19                ans = Math.min(ans, landBegin + landDuration[i]);
20            }
21        }
22
23        return ans;
24    }
25}