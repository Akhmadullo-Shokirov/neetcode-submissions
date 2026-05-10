class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char[] cArray = findMin(strs).toCharArray();
        for(int i=0; i<cArray.length; i++) {
            for(String s : strs) {
                if(cArray[i] != s.charAt(i)) return sb.toString();
            }
            sb.append(cArray[i]);
        }
        return sb.toString();
    }

    public String findMin(String[] strs) {
        String result = strs[0];
        for(String s : strs) {
           if(s.length() < result.length()) result = s;
        }
        return result;
    }
}