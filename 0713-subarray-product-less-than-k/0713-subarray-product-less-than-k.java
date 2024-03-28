class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;
        int c=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=1;
        //     for(int j=i;j<nums.length;j++){
        //         sum*=nums[j];
        //         if(sum<k)
        //             c++;
        //     }
        // }
        int l=0,r=0,prod=1,n=nums.length;
        while(r<n){
            prod*=nums[r];
            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            c+=1+(r-l);
            r++;
        }
        return c;
    }
}