class Solution {
    public int lengthOfLastWord(String s) {
        String[] newStringArray = s.trim().split(" ");
        return newStringArray[newStringArray.length - 1].trim().length();
    }
}