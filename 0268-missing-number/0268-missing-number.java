class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
         int sum = Arrays.stream(nums).sum();
         int a=(n*(n+1)/2)- sum;
         return a;
    }
}