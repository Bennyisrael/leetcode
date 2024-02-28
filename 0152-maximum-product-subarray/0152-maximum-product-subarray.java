class Solution {
    public int maxProduct(int[] nums) {
        int maxi=nums[0];
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            //maxi=prod>maxi?prod:maxi;
           maxi=Math.max(prod,maxi);
            if(prod==0)
                prod=1;
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            prod*=nums[i];
            //maxi=prod>maxi?prod:maxi;
           maxi=Math.max(prod,maxi);
            if(prod==0)
                prod=1;
        }
        return maxi;
    }
}