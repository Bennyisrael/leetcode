class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
         int sum = Arrays.stream(nums).sum();
         int a=(n*(n+1)/2)- sum;
        //  if(a==0)
        //     return n+1;
         return a;
    }
}