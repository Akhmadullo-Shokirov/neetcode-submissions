class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for(int n : nums) {
            frequencyCount.put(n, frequencyCount.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList(frequencyCount.entrySet());
        Collections.sort(entries, (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = entries.get(i).getKey();
        }
        return result;
    }
}
