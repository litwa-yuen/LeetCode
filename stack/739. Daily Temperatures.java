class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            else {
           
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    int temp = stack.pop();
                    result[temp] = i - temp;
                }
                
                stack.push(i);
            }
        }
        return result;
    }
}
