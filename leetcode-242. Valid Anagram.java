class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charsDifference = new int[26];
        if(s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            charsDifference[s.charAt(i) - 'a']++;
            charsDifference[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(charsDifference[i] != 0) {
                return false;
            }
        }
        return true;
    }
}