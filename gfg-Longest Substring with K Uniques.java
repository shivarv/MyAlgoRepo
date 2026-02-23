class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int max = -1;
        int charCount[] = new int[26];
        HashMap<Character, String> sMap  = new HashMap<Character, String>();
        int uniqueItem = 0;
        int start = 0;
        int end  = 0;
        while(end < s.length()) {
            if(charCount[s.charAt(end) - 'a'] == 0) {
                uniqueItem++;
            }
            charCount[s.charAt(end) - 'a']++;
            if(uniqueItem > k) {
				//it hits here and it means uniqueItem > k..
				//first remove the startItem, then check if charCount == 0
                charCount[s.charAt(start) - 'a']--;
                if(charCount[s.charAt(start) - 'a'] == 0) {
                    uniqueItem--;
                }
                start++;
            }
            if(uniqueItem == k) {
                max = Math.max(max, end - start + 1);
            }
            end++;
        }
        return max;
    }
}