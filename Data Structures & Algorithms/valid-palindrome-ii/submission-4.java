class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() <= 1) return true;
        for(int i=0; i<s.length() -1; i++) {
            String a = s.substring(0, i) + s.substring(i+1, s.length());
            if(isPalindrome(a)) return true;
        }   
        return false;
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return s.equals(sb.reverse().toString());
    }
}