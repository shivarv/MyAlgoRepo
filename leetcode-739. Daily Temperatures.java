class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        //if we need next greater no, we need decreasing stack
        Stack<Integer> decreasingStack = new Stack<Integer>();
        
        for(int i = temperatures.length - 1; i >= 0; i--) {
            // >= ..strictly warmer
            while(!decreasingStack.isEmpty() 
                && temperatures[i] >= temperatures[decreasingStack.peek()]) {
                decreasingStack.pop();
            }
            if(decreasingStack.isEmpty()) {
                output[i] = 0;
            } else {
                //index is difference in days.. not 76 - 72..it is  1
                // decreasingStack.peek() - temperatures[i]
                output[i] = decreasingStack.peek() -  i;
            }
            decreasingStack.add(i);
        }
        return output;
    }
}

https://leetcode.com/problems/evaluate-reverse-polish-notation/
