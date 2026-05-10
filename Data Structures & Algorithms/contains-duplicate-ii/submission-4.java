class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> values = new HashMap();
        for(int i=0; i<nums.length; i++) {
            if(values.containsKey(nums[i]) && i-values.get(nums[i]) <=k) { 
                return true;
            } else{
                values.put(nums[i], i);
            }
        }
        return false;
    }
}