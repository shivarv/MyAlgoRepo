class Solution {
    public String decodeString(String s) {
        Stack<String> charStack = new Stack<String>();
        Stack<Integer> numStack = new Stack<Integer>();
        int k = 0;
        String current = "";
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                k = k * 10 + (s.charAt(i) - '0');
            } else if(s.charAt(i) == '[') {
                charStack.push(current);
                numStack.push(k);
                current = "";
                k = 0;
            } else if(s.charAt(i) == ']') {
                int repeatNum = numStack.pop();
                String prev = charStack.pop();
                StringBuilder sb = new StringBuilder();
                while(repeatNum > 0) {
                    sb.append(current);
                    repeatNum--;
                }
                k = 0;
                current = prev + sb.toString();
            } else {
                current += s.charAt(i);
            }
        }
        return current;
    }
}