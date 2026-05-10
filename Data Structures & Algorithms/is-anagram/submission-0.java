class Solution {
    public boolean isAnagram(String s, String t) {

        Map<String, Integer> characters = new HashMap();
        for(String c : s.split("")) {
            if(characters.containsKey(c)) {
                characters.put(c, characters.get(c) + 1);
            } else {
                characters.put(c, 1);
            }
        }

        for(String c : t.split("")) {
            if(characters.containsKey(c)) {
                characters.put(c, characters.get(c) - 1);
                if(characters.get(c) == 0) {
                    characters.remove(c);
                }
            } else {
                return false;
            }
        }

        return characters.size() == 0;
    }
}
