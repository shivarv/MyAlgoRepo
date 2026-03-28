class FreqStack {
    Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
    Map<Integer, Stack<Integer>> groupStack = new HashMap<Integer, Stack<Integer>>();
    int maxFreq = 0;
    public FreqStack() {
        
    }
    
    public void push(int val) {
        int count = freqMap.getOrDefault(val, 0) +1;
        freqMap.put(val, count);
        Stack<Integer> output; 
        if(groupStack.containsKey(count)) {
            output = groupStack.get(count);
        } else {
            output = new Stack<Integer>();
        }
        output.push(val);
        groupStack.put(count , output);
        maxFreq = Math.max(maxFreq, count);
    }
    
    public int pop() {
        int index = maxFreq;
        int popVal = 0;
        if(groupStack.get(index).size() == 1) {
            popVal = groupStack.get(index).pop();
            groupStack.remove(index);
            maxFreq--;
        } else {
            popVal = groupStack.get(index).pop();
        }
        // need to set back the maxFreq
        if(freqMap.get(popVal) == 1) {
            freqMap.remove(popVal); 
        } else {
            freqMap.put(popVal, freqMap.get(popVal) - 1 );
        }
        return popVal;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */