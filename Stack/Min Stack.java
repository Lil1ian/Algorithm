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
        
        // 这个地方太蛋疼了，居然要用equals...
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
