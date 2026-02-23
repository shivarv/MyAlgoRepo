
//slightly tricky
//the idea is sliding window
//loop through the string
//if the char is already present
// increment start..remove the start char from the hashmap
// else 
//	calculate max = Math.max(max, i - start + 1);
//	increment the array loop

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer > charPlacement = new HashMap<Character, Integer>();
        int max = 0;
        int start = 0;
        if(s.length() == 1) {
            return 1;
        }
        for(int i = 0; i < s.length(); ) {
            if(charPlacement.containsKey(s.charAt(i))) {
                charPlacement.remove(s.charAt(start));
                start++;
            } else {
                max = Math.max(max, i - start + 1 );
                charPlacement.put(s.charAt(i), i);
                i++;
            }
        }
        return max;
    }
}
