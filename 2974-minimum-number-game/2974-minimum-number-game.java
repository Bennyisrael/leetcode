class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int [nums.length];
        int a,b;
        for(int i=0;i<nums.length;i+=2){
            a=nums[i];
            b=nums[i+1];
            arr[i]=b;
            arr[i+1]=a;
        }
        return arr;
    }
}