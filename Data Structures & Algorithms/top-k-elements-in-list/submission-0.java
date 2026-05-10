class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> values = new HashMap();
        for(int i=0; i<nums.length; i++) {
            values.put(nums[i], values.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> valuesList = new ArrayList();
        for(Map.Entry<Integer, Integer> entry : values.entrySet()) {
            valuesList.add(new int[]{entry.getValue(), entry.getKey()});
        }

        valuesList.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = valuesList.get(i)[1];
        }
        return res;
    }
}
