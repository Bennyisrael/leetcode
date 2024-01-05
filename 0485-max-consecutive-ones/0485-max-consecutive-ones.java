class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int s=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                s++;
            }
            else{
                max=Math.max(s,max);
                s=0;
            }
        }
        return Math.max(s,max);
    }
}