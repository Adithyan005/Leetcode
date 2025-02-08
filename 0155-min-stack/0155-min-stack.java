class MinStack {
        Stack <Integer> s;
        int top;
    public MinStack() {
        s=new Stack<>();
        this.top=-1;
    }
    
    public void push(int val) {
        s.push(val);
        top++;
    }
    
    public void pop() {
        if(!s.isEmpty())
        {
            s.pop();
            top--;
        }
    }
    
    public int top() {
       return s.peek();
    }
    
    public int getMin() {
        if(!s.isEmpty())
            return Collections.min(s);
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