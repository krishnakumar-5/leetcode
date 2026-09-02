class Solution {
    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int res = 0;

        for (int i = 0; i < arr.length && res < arr.length; i++) {
            if (arr[i] == 0) {
                result[res++] = 0;

                if (res < arr.length) {
                    result[res++] = 0;
                }
            } else {
                result[res++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}