class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int num : nums2 ){
            if(hs.contains(num)){
                hs1.add(num);
            }
        }
            int array[] = new int [hs1.size()];
            int k=0;
            for(int i : hs1)
                array[k++]=i;
            return array; 
    }
}