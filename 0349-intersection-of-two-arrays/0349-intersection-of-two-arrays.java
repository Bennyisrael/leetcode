class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       // List<Integer> arr = new ArrayList<>();
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    arr.add(nums1[i]);
                }
            }
        }
            int array[] = new int [arr.size()];
            int k=0;
            for(int i : arr)
                array[k++]=i;
            return array; 
    }
}