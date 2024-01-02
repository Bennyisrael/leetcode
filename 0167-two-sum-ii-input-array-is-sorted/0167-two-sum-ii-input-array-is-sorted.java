class Solution {
    public int[] twoSum(int[] n, int target) {
        int i = 0, j = n.length - 1;
        while (i < j) {
            if (target < n[i] + n[j]) {
                j--;
            } else if (target > n[i] + n[j]) {
                i++;
            } else {
                return new int[]{i+1, j+1};
            }
        }
        return new int[]{};
    }
}
