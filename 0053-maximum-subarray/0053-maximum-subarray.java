class Solution {
    public int maxSubArray(int[] arr) {
        int maxi=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum += arr[i];
            maxi = sum>maxi?sum:maxi;
            if (sum < 0)
                sum = 0;
        }
        return maxi;
    }
}