class Solution {
    public int findMin(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        Integer[] uniqueNums = set.toArray(new Integer[0]);

        int min = uniqueNums[0];

        for (int i = 1; i < uniqueNums.length; i++) {
            if (uniqueNums[i] < min) {
                min = uniqueNums[i];
            }
        }

        return min;
    }
}