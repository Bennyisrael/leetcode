class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();
        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(h.entrySet());
        Collections.sort(sortedEntries, Comparator.comparingInt(Map.Entry::getKey));
        return sortedEntries.get(sortedEntries.size() / 2).getKey();
    }
}
