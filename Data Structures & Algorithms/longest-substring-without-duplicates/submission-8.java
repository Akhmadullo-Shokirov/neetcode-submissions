class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length() <= 1) return s.length();
        int count = 0;
        int left = 0;
        int right = 0;
        Set<Character> chars = new HashSet<>();
        while(right < s.length()) {
            while(!chars.add(s.charAt(right))) {
                chars.remove(s.charAt(left));
                left++;
            }
            count = Math.max(count, right - left + 1);

            right++;
        }
        return count;
    }
}
