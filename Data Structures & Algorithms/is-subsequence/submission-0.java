class Solution {
    public boolean isSubsequence(String s, String t) {
        String remainingSubstring = t;
        for(String k : s.split("")) {   
            if(remainingSubstring.contains(k)) {
                remainingSubstring = 
                remainingSubstring.substring(remainingSubstring.indexOf(k) + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}