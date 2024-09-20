class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        Stack<Node> stack = new Stack();
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek().height > heights[i]) {
                Node pre = stack.pop();
                max = Math.max(max, heights[i] * (i - pre.i));
                start = pre.i;
            }
            stack.push(new Node (start, heights[i]));
        }
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            max = Math.max(max, current.height * (heights.length - current.i));
        }
        return max;
    }

    public class Node {
        int i;
        int height;
        public Node(int i, int height) {
            this.i = i;
            this.height = height;
        }
    }
}
