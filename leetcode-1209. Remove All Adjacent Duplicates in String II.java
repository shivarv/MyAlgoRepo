class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> sStack = new Stack<int[]>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            //peek will throw exception if not empty
            if(!sStack.isEmpty() && ch == sStack.peek()[0]) {
                sStack.peek()[1]++;
            } else {
                sStack.push(new int[]{ch, 1});
            }
            if(sStack.peek()[1] == k) {
                sStack.pop();
            }
        }
        //it cant be handled like a stack, need to visit from start
        for (int[] pair : sStack) {
            char ch = (char) pair[0];
            for(int i = 0 ; i < pair[1]; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}