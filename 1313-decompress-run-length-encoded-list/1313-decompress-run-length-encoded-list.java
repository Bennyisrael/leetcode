class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        // for(int i=0;i < n-1;i+=2){
        //     int a=nums[i];
        //     int b=nums[i+1];
        //     int j=0,x=0;
        //     for(x=0;x<a;x++){
        //         arr[j++]=b;
        //     }
        // }
        int l=0;
        for(int i=0;i<n;i+=2)
            l+=nums[i];
        int arr[] = new int [l];
        int index = 0;
        for (int i = 0; i < n; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                arr[index++] = val;
            }
        }
        return arr;
    }
}