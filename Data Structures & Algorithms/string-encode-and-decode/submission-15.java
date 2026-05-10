class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    // input - "Hello", "World"
    // encod - "5#Hello5#World"
    //          0123456789

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int curr = 0;
        while(curr < str.length()) {
            int j = curr;
            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(curr, j));
            String word = str.substring(j + 1, j + 1 + length);
            result.add(word);
            curr = j + length + 1;
            
        }
        return result;
    }
}
