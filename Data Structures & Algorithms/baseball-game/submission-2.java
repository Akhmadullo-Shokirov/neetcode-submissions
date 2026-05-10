class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> records = new Stack();
        // 5, -2, -4, 9, 5, 14
        // 24 + 3
        for(String s : operations) {
            switch(s) {
                case "+":
                    int val1 = records.pop();
                    int val2 = records.pop();
                    int val3 = val1 + val2;
                    records.push(val2);
                    records.push(val1);
                    records.push(val3);
                    break;
                case "D":
                    records.push(records.peek() * 2);
                    break;
                case "C":
                    records.pop();
                    break;
                default:
                    records.push(Integer.valueOf(s));
                    break;
            }
        }
        int result = 0;
        while(!records.isEmpty()) {
            result += records.pop();
        }
        return result;
    }
}