class Solution {
    public int findDuplicate(int[] nums) {
       Map<Integer,Integer> hp=new HashMap<>();
       for (int num : nums)
            hp.put(num, hp.getOrDefault(num, 0) + 1);
        for(Map.Entry<Integer,Integer> entry : hp.entrySet()){
            if(entry.getValue()>1)
                return entry.getKey();
        }
    return 0;
    }
}