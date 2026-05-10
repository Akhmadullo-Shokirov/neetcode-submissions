class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int maxLength = 0;
        for(int i : set) {
            System.out.println(i);
            int start = i;
            int count = 0;
            while(set.contains(start - 1)) {
                start = start - 1;
            }
            count++;
            int curr = start + 1;
            while(set.contains(curr)) {
                count++;
                curr = curr+1;
            }
            maxLength = Math.max(count, maxLength);
        }
        return maxLength;
    }
}
