class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             return nums1[i];
        //         }
        //     }
        // }
        // return -1;
        // List<Integer> arr1 = new ArrayList<>();
        // for(int i: nums1){
        //     arr1.add(i);
        // }
        // for(int i:nums2){
        //     if(arr1.contains(i)){
        //         return i;
        //     }
        // }
        // return -1;
        HashSet<Integer> arr1 = new HashSet<>();
        for(int i: nums1){
            arr1.add(i);
        }
        for(int i:nums2){
            if(arr1.contains(i)){
                return i;
            }
        }
        return -1;
    }
}