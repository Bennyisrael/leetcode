class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
            s+=nums[i];
        int n=nums.length+1;
        int sum=n*(n-1)/2;
        return sum-s;
    }
}