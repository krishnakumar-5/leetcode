// Last updated: 2/13/2026, 10:17:51 AM
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        String result[] = new String[list1.length];
        int index[] = new int[list1.length];

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    result[i] = list1[i];
                    index[i] = i + j;
                    break;
                }
            }
        }

        int min = Integer.MAX_VALUE;

        // Find minimum index sum
        for (int i = 0; i < index.length; i++) {
            if (result[i] != null && index[i] < min) {
                min = index[i];
            }
        }

        // Store all strings that have this minimum index sum
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            if (result[i] != null && index[i] == min) {
                list.add(result[i]);
            }
        }

        // Convert to array
        String[] v = new String[list.size()];
        for (int i = 0; i < v.length; i++) {
            v[i] = list.get(i);
        }

        return v;
    }
}
