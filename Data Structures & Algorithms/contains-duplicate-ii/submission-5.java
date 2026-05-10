class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> values = new HashSet();
        var left = 0;
        var right = 0;
        while(right < nums.length) {
            if(right - left > k) {
                values.remove(nums[left]);
                left++;
            }
            if(values.contains(nums[right])) {
                return true;
            }
            values.add(nums[right]);
            right++;
        }
        return false;
        
    }
}