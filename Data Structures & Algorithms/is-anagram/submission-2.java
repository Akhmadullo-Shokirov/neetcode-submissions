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
        
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        return Arrays.toString(sArray)
            .equals(Arrays.toString(tArray));
    }
}
