class MinStack {
    Stack<Integer> actualStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public MinStack() {
        actualStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        actualStack.push(val);
        if(minStack.isEmpty() == true || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!actualStack.isEmpty()) {
            int item = actualStack.pop();
            //if 
            if(minStack.peek() == item) {
                minStack.pop();
            }
        }
    }
    
    public int top() {
        if(!actualStack.isEmpty()) {
            return actualStack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */