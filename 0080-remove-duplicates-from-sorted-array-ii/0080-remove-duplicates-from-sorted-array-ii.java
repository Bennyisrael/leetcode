class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int c = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[c - 2]) {
                nums[c] = nums[i];
                c++;
            }
        }
                return c;
    }
}