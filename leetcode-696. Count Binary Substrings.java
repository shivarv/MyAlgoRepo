class Solution {
    public int countBinarySubstrings(String s) {
       int currentGroup = 1;
       int prevGroup = 0;
       int totalCount = 0;
       for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                currentGroup++;
            } else {
                totalCount += Math.min(currentGroup , prevGroup);
                prevGroup = currentGroup;
                currentGroup = 1;
            }
       }
        totalCount += Math.min(currentGroup , prevGroup);
        return totalCount;
    }
}