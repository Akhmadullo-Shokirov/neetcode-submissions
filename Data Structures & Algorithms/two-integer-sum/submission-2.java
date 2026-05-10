class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap();
        for(int i=0; i<nums.length; i++) {
            int subtraction = target-nums[i];
            if(values.containsKey(subtraction)) {
                return new int[]{values.get(subtraction), i};
            } else {
                values.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}