import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> rows = new HashMap<>();

        for (int[] seat : reservedSeats) {
            rows.computeIfAbsent(seat[0], k -> new HashSet<>()).add(seat[1]);
        }

        int ans = (n - rows.size()) * 2;

        for (Map.Entry<Integer, Set<Integer>> entry : rows.entrySet()) {

            Set<Integer> li = entry.getValue();

            boolean left = false;
            boolean right = false;
            boolean cen = false;

            if (!li.contains(2) &&
                !li.contains(3) &&
                !li.contains(4) &&
                !li.contains(5)) {

                left = true;
            }

            if (!li.contains(4) &&
                !li.contains(5) &&
                !li.contains(6) &&
                !li.contains(7)) {

                cen = true;
            }

            if (!li.contains(6) &&
                !li.contains(7) &&
                !li.contains(8) &&
                !li.contains(9)) {

                right = true;
            }

            if (left && right) {
                ans += 2;
            }

            else if (left) {
                ans += 1;
            }

            else if (right) {
                ans += 1;
            }

            else if (cen) {
                ans += 1;
            }
        }

        return ans;
    }
}