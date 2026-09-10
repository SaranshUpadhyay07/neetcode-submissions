class MinStack {
    ArrayDeque<Integer> q1;
    ArrayDeque<Integer> q2;
    public MinStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int val) {
        q1.push(val);
    }
    
    public void pop() {
        q1.pop();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        while(!q1.isEmpty()){
            min = Math.min(min,q1.peek());
            q2.push(q1.pop());
        } 
        while(!q2.isEmpty()) q1.push(q2.pop());
        return min;
    }
}
