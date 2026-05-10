class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int length = chars.length;
        int l=0;
        int r=length-1;
        while(l < r) {
            while(l < r && !Character.isLetterOrDigit(chars[l])) {
                l++;
            }

            while(l < r && !Character.isLetterOrDigit(chars[r])) {
                r--;
            }

            if(chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
