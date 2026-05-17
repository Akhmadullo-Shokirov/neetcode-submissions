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
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.add(stack.peek() * 2);
                    break;
                default:
                    stack.add(Integer.valueOf(o));
                    break;
            }
        }

        while(!stack.isEmpty()) {
            record += stack.pop();
        }
        return record;
    }
}