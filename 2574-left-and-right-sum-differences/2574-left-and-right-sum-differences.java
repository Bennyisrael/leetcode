class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int l[]=new int [n];
        int r[]=new int [n];
        r[0]=0;l[n-1]=0;
        for(int i=1;i<n;i++){
            r[i]=r[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            l[i]=l[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(r[i]-l[i]);
        }
        return nums;
    }
}