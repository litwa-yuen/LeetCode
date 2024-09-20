class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        int result = 0;
        for (String token : tokens) {
            if (token.equals("+")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1+num2);
            } else if (token.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2-num1);
            } else if (token.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1*num2);
            } else if (token.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2/num1);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
