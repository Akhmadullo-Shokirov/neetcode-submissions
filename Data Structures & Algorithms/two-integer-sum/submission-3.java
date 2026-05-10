class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> pairs = new HashMap();
        for(int i=0; i<nums.length; i++) {
            if(pairs.containsKey(target - nums[i])) {
                result[0] = pairs.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                pairs.put(nums[i], i);
            }
        }
        return result;
    }
}
