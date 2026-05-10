class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        char[] chars = s.toCharArray();
        for(int i=1; i<chars.length; i++) {
            score += Math.abs(chars[i] - chars[i-1]);
        }
        return score;
    }
}