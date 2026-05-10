class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        // ["act", "pots", "tops", "cat", "stop", "hat"]
        // [["act", "cat"], ["pots", "tops", "stop"], ["hat"]]
        
        for(String s : strs) {
            boolean flag = false;
            for(String key : map.keySet()) {
                if(isAnagram(key, s)) {
                    map.get(key).add(s);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(s, newList);
            }
        }
    
        List<List<String>> result = new ArrayList<>();
        for(List<String> v : map.values()) {
            result.add(v);
        }
        return result;
    }

    public static boolean isAnagram(String s, String t) {
        // act - cat
        if(s.length() != t.length()) return false;
        Map<Character, Integer> count = new HashMap<>();
        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(count.containsKey(c)) {
                count.put(c, count.get(c) - 1);
                if(count.get(c) == 0) {
                    count.remove(c);
                }
            } else {
                return false;
            }
        }
        return count.size() == 0;
    }
}
