class Solution {
    public boolean isSubsequence(String s, String t) {
    
        return recursion(s, t, 0, 0);

    }
    public static boolean recursion(String s, String t, int i, int j) {
        if(i == s.length()) return true;
        if(j == t.length()) return false;

        if(s.charAt(i) == t.charAt(j)) {
           return recursion(s, t, i+1, j+1);
        } else {
           return recursion(s, t, i, j+1);
        }
    }
}