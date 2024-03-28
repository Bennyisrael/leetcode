class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : arr)
            mp.put(i,mp.getOrDefault(i,0)+1);
        List<Integer> remove = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==1){
                remove.add(entry.getKey());
                k--;
                if(k==0)
                    break;
            }
            if(entry.getValue()==k){
                remove.add(entry.getKey());
                k-=2;
                if(k==0)
                    break;
            }
        }
        for(int i : remove){
            mp.remove(i);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i: mp.values())
            set.add(i);

        return set.size();
    }
}