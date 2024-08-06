class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=0;
            for(int j=i;j<nums.length;j++){
                x+=nums[j];
                arr.add(x);
            }
        }
        Collections.sort(arr);
        int s=0;
        for(int i=left-1;i<right;i++){
            s+=(arr.get(i)%1000000007);
        }
        return s;
    }
}