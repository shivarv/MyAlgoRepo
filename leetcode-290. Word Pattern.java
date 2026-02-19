class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> cStringMap = new HashMap<Character, String>();
        Map<String, Character> sCharMap = new HashMap<String, Character>();
        String[] sList = s.split(" ");
        if(sList.length != pattern.length()) {
            return false;
        }
        for(int i = 0; i < pattern.length(); i++) {
            if(cStringMap.containsKey(pattern.charAt(i))) {
                if(!cStringMap.get(pattern.charAt(i)).equals(sList[i])) {
                    return false;
                }
            } else if(sCharMap.containsKey(sList[i])) {
                if(sCharMap.get(sList[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                cStringMap.put(pattern.charAt(i), sList[i]);
                sCharMap.put(sList[i], pattern.charAt(i));
            }
        }
        return true;
    }
}