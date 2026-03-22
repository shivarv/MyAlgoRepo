class Solution {
    public boolean isValid(String s) {
        Set<Character> closeCharsMap = new HashSet<Character>();
        Map<Character, Character> closeOpenMap = 
                new HashMap<Character, Character>();
        closeOpenMap.put(')', '(');
        closeOpenMap.put('}', '{');
        closeOpenMap.put(']', '[');
        closeCharsMap.add(')');
        closeCharsMap.add('}');
        closeCharsMap.add(']');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(closeCharsMap.contains(s.charAt(i))) {
                if(stack.isEmpty()) {
                    return false;
                }
                 Character keyItem = stack.pop();
                if(closeOpenMap.get(s.charAt(i)) != keyItem )
                    return false;
                
            } else {
                stack.add(s.charAt(i));
            }
        }
        System.out.println(stack.size());
        return stack.size() == 0;
    }
}