// Last updated: 2/13/2026, 10:18:26 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int MARK = 999; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = MARK;
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == MARK) {
                int index = i;
                boolean moved = false;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != MARK) {
                        nums[index] = nums[j];
                        nums[j] = MARK;
                        moved = true;
                        break; 
                    }
                }
                if (!moved) {
                    count++;
                }
            }
        }
        return nums.length - count;
    }
}
