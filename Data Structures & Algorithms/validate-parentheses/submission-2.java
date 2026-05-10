class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // ) } ]
            if(stack.isEmpty()) {return false;}
            char top = stack.peek();
            switch(c) {
                case ')':
                    if(top != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if(top != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if(top != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
            }
            
        }
        return stack.isEmpty();
    }
}
