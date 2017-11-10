Stack<Integer> elements = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int x) {
        elements.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (elements.isEmpty()) {
            return;
        }
        
        
        if (elements.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        elements.pop();
    }

    public int top() {
        return elements.peek();       
    }

    public int getMin() {
        return minStack.peek();
    }
