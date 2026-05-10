class Solution {
    public void reverseString(char[] s) {
        var left = 0;
        var right = s.length - 1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}