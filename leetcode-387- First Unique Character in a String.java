class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            frequencyMap.put(s.charAt(i) , frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

//my other solution, feels more accurate since the space is only 26..
class Solution {
    public int firstUniqChar(String s) {
         int[] freq = new int[26]
        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first unique
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}