class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int i : map.values()){
            max=Math.max(i,max);
        }
        int sum=0;
        for(int i : map.values()){
            if(i==max){
                sum+=max;
            }
        }
        return sum;
    }
}