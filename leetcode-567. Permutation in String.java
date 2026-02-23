class Solution {
    //key points :
    // we need to see if s1 (combination) is present in s2
    // setup charItem array 
    // load s1 count to the charItem
    // assignRequired as count of s1
    // setup start = end = 0 ( sliding window)
    // loop through s2 string
    // reduce the charItem count of the character
    //key is if(charItem[s2.charAt(end) -'a'] > 0) { required--;}
    // if (end - start + 1 > s1.length)
    // ideally we are removing the start variable from charItem only if its >= 0
    //if(charItem[s2.charAt(start) -'a'] >= 0) , increment start , required 
    //   if required == 0,  return true
    public boolean checkInclusion(String s1, String s2) {
        int[] charItem = new int[26];
        int required = 0;
        int start = 0 , end = 0;
        if(s1.length() > s2.length()) {
            return false;
        }
        for(int i = 0; i < s1.length(); i++) {
            charItem[s1.charAt(i) - 'a']++;
        }
        required = s1.length();
        while(end < s2.length()) {
            if(charItem[s2.charAt(end) -'a'] > 0) {
                required--;
            }
            charItem[s2.charAt(end) -'a']--;
            if(end - start + 1 > s1.length()) {
                if(charItem[s2.charAt(start) -'a'] >= 0) {
                    required++;
                }
                charItem[s2.charAt(start) -'a']++;
                start++;
            }
            if(required == 0) {
                return true;
            }
            end++;
        }
        return false;
    }
}
/*
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<Character, Integer>();  
        Map<Character, Integer> s2Map = new HashMap<Character, Integer>();
        int start = 0;
        if(s1.length() > s2.length()) {
            return false;
        }
        for(int i = 0; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
        }
        for(int i = s1.length(); i < s2.length(); i++) {
            if(compareHashMap(s1Map, s2Map)) {
                return true;
            }
            s2Map.put(s2.charAt(start), s2Map.get(s2.charAt(start)) - 1);
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
            start++;
        }
        return compareHashMap(s1Map, s2Map);
    }

    boolean compareHashMap(Map<Character, Integer> s1Map, Map<Character, Integer> s2Map) {
        for (Map.Entry<Character, Integer> entry : s1Map.entrySet()) {
            if(!s2Map.containsKey(entry.getKey()) || s1Map.get(entry.getKey()) > s2Map.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }
} */