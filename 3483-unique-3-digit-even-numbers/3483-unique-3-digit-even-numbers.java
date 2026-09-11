class Solution {
    public int totalNumbers(int[] digits) {

        int[] count = new int[10];

        for (int d : digits) {
            count[d]++;
        }

        int answer = 0;

        for (int unit = 0; unit <= 8; unit += 2) {

            if (count[unit] == 0) {
                continue;
            }

            count[unit]--;

            for (int hundred = 1; hundred <= 9; hundred++) {

                if (count[hundred] == 0) {
                    continue;
                }

                count[hundred]--;

                for (int ten = 0; ten <= 9; ten++) {

                    if (count[ten] > 0) {
                        answer++;
                    }
                }

                count[hundred]++;
            }

            count[unit]++;
        }

        return answer;
    }
}