class Solution {
    public boolean isSubsequence(String s, String t) {
         int sPointer = 0;
        int tPointer = 0;
        if(s.length() == 0) {
            return true;
        }
        while(tPointer  < t.length()) {
            if(s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            if(sPointer == s.length()) {
                return true;
            }
            tPointer++;
        }
        return false;
        
    }
}