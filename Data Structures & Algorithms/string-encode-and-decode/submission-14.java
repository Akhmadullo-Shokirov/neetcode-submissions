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
            System.out.println("Current : " + curr);
            int hashIndex = str.substring(curr).indexOf("#");
            System.out.println("Hash index : " + hashIndex);
            int start = curr + hashIndex + 1;
            System.out.println("Start: " + start);
            int length = Integer.parseInt(String.valueOf(str.substring(curr, start - 1)));
            System.out.println("Length : " + length);
            System.out.println("Item: " + str.substring(start, start + length)); 
            result.add(str.substring(start, start + length));
            curr = start + length;
            
        }
        return result;
    }
}
