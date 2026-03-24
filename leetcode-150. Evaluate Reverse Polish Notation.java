class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<Integer>();
        for(String token: tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") ) {
                int value1 = numbers.pop();
                int value2 = numbers.pop();
                if(token.equals("+")) {
                    numbers.push(value1 + value2);
                } else if(token.equals("-")) {
                    numbers.push(value2 - value1);
                } else if(token.equals("*")) {
                    numbers.push(value1 * value2);
                } else {
                    numbers.push(value2 / value1);
                }
            } else {
                numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }
}