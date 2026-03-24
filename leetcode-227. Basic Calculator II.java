class Solution {
    public int calculate(String s) {
        int num = 0;
        int output = 0;
        char sign = '+';
        Stack<Integer> numStack  = new Stack<Integer>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num *= 10;
                num += (ch - '0'); 
            }
            //if its not digit, not empty and if its last letter
            // make sure sign = ch
            // num = 0
            if(!Character.isDigit(ch) && ch != ' ' || i == s.length() -1) {
                if(sign == '+') {
                    numStack.push(num);
                } else if(sign == '-') {
                    numStack.push(-num);
                } else if(sign == '*') {
                    int prevValue = numStack.pop();
                    numStack.push(prevValue * num);
                } else if(sign == '/') {
                    int prevValue = numStack.pop();
                    numStack.push(prevValue / num);
                }
                sign = ch;
                num = 0;
            }
        }
        for(int stackNum: numStack) {
            output += stackNum;
        }
        return output;
    }
}