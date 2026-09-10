class MinStack {
    ArrayDeque<Integer> q1;
    ArrayDeque<Integer> q2;
    public MinStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int val) {
        q1.push(val);
        if(q2.isEmpty() || q2.peek() >= val ) q2.push(val);
    }
    
    public void pop() {
        if (q1.peek().equals(q2.peek())) {
            q2.pop();
        }
        q1.pop();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public int getMin() {
        return q2.peek();
    }
}
