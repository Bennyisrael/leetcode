class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)
            arr.add(nums[i]);
        }
         int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}