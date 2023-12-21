class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> h = new HashMap<>();
        int me = 0, mc = 0;
        for (int i = 0; i < nums.length; i++) {
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
            if (h.get(nums[i]) > mc) {
                mc = h.get(nums[i]);
                me = nums[i];
            }
        }
        if (mc > nums.length / 2) {
            return me;
        }
        return -1;
    }
}
