class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<Integer>();
        int sCharMap[] = new int[26];
        int pCharMap[] = new int[26];
        int start = 0;
        for(int i = 0; i < p.length(); i++) {
            pCharMap[p.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            sCharMap[s.charAt(i) -'a']++;
            if(i - start + 1 == p.length()) {
                if(compareForSame(sCharMap, pCharMap, p)) {
                    output.add(start);
                }
                sCharMap[s.charAt(start) - 'a']--;
                start++;
            }
        }
        return output;
    }

    public boolean compareForSame(int sCharMap[], int pCharMap[], String p) {
        for(int i = 0; i < p.length(); i++) {
            if(sCharMap[p.charAt(i) - 'a'] != pCharMap[p.charAt(i) - 'a']
             ) {
                return false;
            }
        }
        return true;     
    }
}