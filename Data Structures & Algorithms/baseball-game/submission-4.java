class Solution {
    public int calPoints(String[] operations) {
        int record = 0;
        Stack<Integer> stack = new Stack<>();
        for(String o : operations) {
            switch(o) {
                case "+":
                    int temp = stack.pop();
                    int sum = stack.peek() + temp;
                    stack.add(temp);
                    stack.add(sum);
                    record += sum;
                    break;
                case "C":
                    int top = stack.pop();
                    record -= top;
                    break;
                case "D":
                    int peek = stack.peek() * 2;
                    stack.add(peek);
                    record += peek;
                    break;
                default:
                    record += Integer.valueOf(o);
                    stack.add(Integer.valueOf(o));
                    break;
            }
        }
        return record;
    }
}