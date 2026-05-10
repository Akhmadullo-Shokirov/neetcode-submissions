class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // Map<Character, Integer> charCount = new HashMap<>();
        // for(char c : s.toCharArray()) {
        //     charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        // }

        // for(char c : t.toCharArray()) {
        //     if(charCount.containsKey(c)) {
        //         charCount.put(c, charCount.get(c) - 1);
        //         if(charCount.get(c) == 0) {
        //             charCount.remove(c);
        //         }
        //     }
        // }
        
        byte[] count = new byte[26];
        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        };

        for(char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for(int n : count) {
            if(n != 0) return false;
        }
        return true;
    }
}
