public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 3, 4};
        int result = solution.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();

        // Count occurrences of each element
        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        // Create a list of map entries and sort it based on values (counts)
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(h.entrySet());
        Collections.sort(sortedEntries, Comparator.comparingInt(Map.Entry::getValue));

        // Return the majority element (last element in the sorted list)
        return sortedEntries.get(sortedEntries.size() - 1).getKey();
    }
}
