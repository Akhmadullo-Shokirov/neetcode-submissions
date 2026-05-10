class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupsMap = new HashMap();
        for(String s : strs) {
            String sortedS = sort(s);
            if(groupsMap.containsKey(sortedS)) {
                groupsMap.get(sortedS).add(s);
            } else {
                List<String> anagrams = new ArrayList();
                anagrams.add(s);
                groupsMap.put(sortedS, anagrams);
            }
        }
        return new ArrayList(groupsMap.values());
    }

    public static String sort(String value) {
     String[] valueArr = value.split("");
     Arrays.sort(valueArr);
     return Arrays.toString(valueArr);   
    }
}
