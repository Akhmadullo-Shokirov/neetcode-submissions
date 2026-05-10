class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbersSet = new HashSet<>();
        for(int i : nums) {
            numbersSet.add(i);
        } 
        
        return numbersSet.size() < nums.length;
    }
}