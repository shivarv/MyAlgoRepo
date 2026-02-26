class Solution {
    public boolean isSubSeq(String s1, String s2) {
        int s1Pointer = 0;
        int s2Pointer = 0;
        while(s2Pointer  < s2.length()) {
            if(s1.charAt(s1Pointer) == s2.charAt(s2Pointer)) {
                s1Pointer++;
            }
            if(s1Pointer == s1.length()) {
                return true;
            }
            s2Pointer++;
        }
        return false;
        
    }
};