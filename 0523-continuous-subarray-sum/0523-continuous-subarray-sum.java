class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(nums.length==1 && nums[0]%k==0){
        //             return false;
        //         }
        //         if(sum==0 && k==0){
        //             return true;
        //         }
        //         if(k!=0 && sum%k==0)
        //             return true;
        //     }
        // }
        // return false;-------
        //int rem=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=k==0?sum:sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem) > 1){
                    return true;
                }
                }
                else{
                    map.put(rem,i);
            }
        }
        return false;
    }
}