class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0)
            return;
        k=k%n;
        if(k>n)
            return;
        int arr[]=new int[k];
        for(int i=n-k;i<n;i++)
            arr[i-n+k]=nums[i];
        for(int i=n-k-1;i>=0;i--)
            nums[i+k]=nums[i];
        for(int i=0;i<k;i++)
            nums[i]=arr[i];
    }
}