class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet();
        while(end < s.length()) {

            if(set.contains(s.charAt(end))) {
                
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                maxLength = Math.max(maxLength, end - start+1);
                end++;
            }
        }
        return maxLength;
    }
}
