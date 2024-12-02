class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0,lsum=0;
        for(int i : nums){
            tot+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(lsum==tot-lsum-nums[i]){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}