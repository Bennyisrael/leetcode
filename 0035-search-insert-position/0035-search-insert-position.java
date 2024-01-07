class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg=0,end=nums.length-1,mid;
        while(beg<=end){
            mid=(beg+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;
            else
                beg=mid+1; 
        }
        return beg;
    }
}