//Remember 2 hashMap is necessary
//isomorphic needs to be checked for both the string
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> replaceCharacterMap = new HashMap<Character, Character>();
        Map<Character, Character> reverseCharacterMap = new HashMap<Character, Character>();
        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(replaceCharacterMap.containsKey(s.charAt(i))) {
                if(replaceCharacterMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if(reverseCharacterMap.containsKey(t.charAt(i))) {
                
                if(reverseCharacterMap.get(t.charAt(i)) != s.charAt(i)
                ) {
                    return false;
                }
            } else {
                replaceCharacterMap.put(s.charAt(i), t.charAt(i));
                reverseCharacterMap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}