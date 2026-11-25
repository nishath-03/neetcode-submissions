class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) continue;

            int left = map.getOrDefault(i - 1, 0);
            int right = map.getOrDefault(i + 1, 0);
            int sum = left + right + 1;

            map.put(i, sum);
            map.put(i - left, sum);
            map.put(i + right, sum);
        }

        int max = 0;
        for (int i : map.values()) {
            max = Math.max(max, i);
        }
        return max;
    }
}