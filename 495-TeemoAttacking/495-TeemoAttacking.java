// Last updated: 2/13/2026, 10:17:55 AM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
      int total = 0;
      for (int i = 0; i < timeSeries.length; i++) {
        if (i == 0) total += duration;
        else total += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
      }
      return total;

    }
}
