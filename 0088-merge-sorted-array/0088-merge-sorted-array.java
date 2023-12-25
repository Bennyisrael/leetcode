class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m;
        //int arr[]=new int[m+n];
        // for(int i=0;i<m;i++){
        // arr[i]=nums1[i];
        // k++;
        // }
        for(int i=0;i<n;i++){
            nums1[k]=nums2[i];
            k++;
        }
        Arrays.sort(nums1);

    }
}