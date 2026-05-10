class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int currentTarget = 0 - nums[i];
            List<List<Integer>> pairs = twoSum(nums, i, currentTarget);
            for(List<Integer> pair : pairs) {
                List<Integer> triplet = new ArrayList<>(pair);
                triplet.add(nums[i]);
                Collections.sort(triplet);
                result.add(triplet);
            }
        }
        return new ArrayList<>(result);
    }

    public static List<List<Integer>> twoSum(int[] nums, int k, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(i <= k) continue;
            if(pairs.containsKey(target - nums[i])) {
                results.add(Arrays.asList(target - nums[i], nums[i]));
            }
            pairs.put(nums[i], i);
        }
        return results;
    }
}