class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        Set<Integer> numbersSet = new HashSet();
        for(int i=0; i<nums.length; i++) {
            if(!numbersSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}