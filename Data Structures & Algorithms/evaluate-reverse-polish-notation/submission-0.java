class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String t : tokens) {
            switch(t) {
                case "+":
                    int arg1 = stack.pop();
                    int arg2 = stack.pop();
                    stack.push(arg1 + arg2);
                    break;
                case "*":
                    int arg3 = stack.pop();
                    int arg4 = stack.pop();
                    stack.push(arg3 * arg4);
                    break;
                case "-":
                    int arg5 = stack.pop();
                    int arg6 = stack.pop();
                    stack.push(arg6 - arg5);
                    break;
                case "/":
                    int arg7 = stack.pop();
                    int arg8 = stack.pop();
                    stack.push(arg8 / arg7);
                    break;
                default:
                    stack.push(Integer.valueOf(t));
                break;
            }
        }
        return stack.pop();
    }
}
