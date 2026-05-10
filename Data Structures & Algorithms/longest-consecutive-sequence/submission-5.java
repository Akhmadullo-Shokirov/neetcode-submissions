class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int maxLength = 0;
        for(int i : set) {
            if(!set.contains(i-1)) {
                int length = 1;
                while(set.contains(i+length)) {
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
