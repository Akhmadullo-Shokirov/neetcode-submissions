class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) chars.add(c);
        
        for (char curr : chars) {
            for(int i=0; i<s.length(); i++) {
                int operation = 0;
                int count = 0;
                for(int j=i; j<s.length(); j++) {
                    if(s.charAt(j) == curr) {
                        count++;
                    } else {
                        if(operation < k) {
                            operation++;
                            count++;
                        } else {
                            break;
                        }
                    }
                }
                maxLength = Math.max(count, maxLength);
            }
        }
        return maxLength;
    }
}