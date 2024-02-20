class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[]=new int [nums.length];
        int k=1,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j+=2;
            }
            else{
                arr[k]=nums[i];
                k+=2;
            }
        }
        return arr;
    }
}