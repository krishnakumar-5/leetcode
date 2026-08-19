import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> rows = new HashMap<>();

        // Store reserved seats row-wise
        for (int[] seat : reservedSeats) {
            rows.computeIfAbsent(seat[0], k -> new HashSet<>()).add(seat[1]);
        }

        // Initially, every row can accommodate 2 families
        int ans = (n - rows.size()) * 2;

        // Process only rows having reserved seats
        for (Map.Entry<Integer, Set<Integer>> entry : rows.entrySet()) {

            Set<Integer> li = entry.getValue();

            boolean left = false;
            boolean right = false;
            boolean cf = false;
            boolean cs = false;

            // Seats 2,3,4,5
            if (!li.contains(2) &&
                !li.contains(3) &&
                !li.contains(4) &&
                !li.contains(5)) {

                left = true;
            }

            // Seats 4,5
            if (!li.contains(4) &&
                !li.contains(5)) {

                cf = true;
            }

            // Seats 6,7
            if (!li.contains(6) &&
                !li.contains(7)) {

                cs = true;
            }

            // Seats 6,7,8,9
            if (!li.contains(6) &&
                !li.contains(7) &&
                !li.contains(8) &&
                !li.contains(9)) {

                right = true;
            }

            // Two families
            if (left && right) {
                ans += 2;
            }

            // Only left
            else if (left) {
                ans += 1;
            }

            // Only right
            else if (right) {
                ans += 1;
            }

            // Middle
            else if (cf && cs) {
                ans += 1;
            }
        }

        return ans;
    }
}