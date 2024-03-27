class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        // int c = 0;
        // for (int value : mp.values()) {
        //     if (value == 1) {
        //         c++;
        //     }
        // }
        int arr[]=new int [2];
        int i=0;
        for(Map.Entry<Integer,Integer> ent : mp.entrySet()){
            if(ent.getValue()==1){
                arr[i++]=ent.getKey();
                if(i==2)break;
            }
        }
        return arr;
    }
}