class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()) {

            while(s.substring(left, right).contains(s.substring(right, right+1))) {
                left++;
            }
            right++;
            maxLength = Math.max(s.substring(left, right).length(), maxLength);
        }
        return maxLength;
    }
}
