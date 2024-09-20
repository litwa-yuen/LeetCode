//using Node instead of two stacks
class MinStack {
    Node head;
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node (val, val, null);
        }
        else {
            Node current = new Node(val, Math.min(val, head.min), head);
            head = current;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;        
    }
    
    public int getMin() {
        return head.min;
    }
    private class Node {
        int val;
        int min; 
        Node next;

        private Node (int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    
    public void push(int val) {
        s1.push(val);
        if (s2.isEmpty()) {
            s2.push(val);
        }
        else {
            int min = s2.peek();
            s2.push(Math.min(val, min));
        }
    }
    
    public void pop() {
        s1.pop();
        s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}
 */
