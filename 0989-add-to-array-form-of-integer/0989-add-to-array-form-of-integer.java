class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
         int s = 0;
        List<Integer> arr = new ArrayList<>();
        int carry = k;

        for (int i = nums.length - 1; i >= 0; i--) {
            int sum = nums[i] + carry % 10;
            carry = carry / 10 + sum / 10;
            arr.add(0, sum % 10);
        }
        
        while (carry > 0) {
            arr.add(0, carry % 10);
            carry /= 10;
        }

        return arr;
    }
}