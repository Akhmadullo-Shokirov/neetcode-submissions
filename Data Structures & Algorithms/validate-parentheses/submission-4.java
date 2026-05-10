class Solution {
    public boolean isValid(String s) {
        // "( [ { } ] )"
        // [ ]
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            // ( [ { -> add to stack
            switch(c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
