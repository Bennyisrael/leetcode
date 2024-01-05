class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int s=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                s++;
                max=Math.max(s,max);
            }
            else
                s=0;
        }
        return max;
    }
}