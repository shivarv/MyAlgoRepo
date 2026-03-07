class Solution {
        
    private int indexOf(char ch) {
        if (ch >= 'A' && ch <= 'Z') return ch - 'A';
        if (ch >= 'a' && ch <= 'z') return (ch - 'a') + 26;
        return -1;
    }

    public String minWindow(String s, String t) {
        int[] charCount = new int[52];
        int min = Integer.MAX_VALUE;
        boolean isFound = false;
        int lastSpot = 0;
        int start = 0 , end = 0;
        for(int i = 0; i< t.length(); i++) {
            charCount[indexOf(t.charAt(i))]++;
        }
        for(int i = 0; i < s.length(); i++) {
            charCount[indexOf(s.charAt(i))]--;
            if((i - lastSpot + 1 >= t.length() ) && checkCount(charCount)) {
                isFound = true;
                if(i - lastSpot < min) {
                    min =   Math.min(min, i - lastSpot + 1);
                    start = lastSpot;
                    end = i;
                }
                while(checkCount(charCount)) {
                    isFound = true;
                    if(i - lastSpot < min) {
                        min =   Math.min(min, i - lastSpot + 1);
                        start = lastSpot;
                        end = i;
                    }
                    charCount[indexOf(s.charAt(lastSpot))]++;
                    lastSpot++;
                }                
            }
        }
        if(!isFound) {
            return "";
        }
        return s.substring(start, end + 1);
    }

    private boolean checkCount(int[] charCount) {
        for(int i = 0; i < charCount.length; i++) {
            if(charCount[i] > 0) {
                return false;
            }
        }
        return true;
    }

}


// chatgpt code
class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || t.length() == 0 || s.length() < t.length()) return "";

        int[] need = new int[128]; // ASCII
        for (int i = 0; i < t.length(); i++) need[t.charAt(i)]++;

        int left = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);
            if (need[rc] > 0) required--;
            need[rc]--;

            // Shrink while valid
            while (required == 0) {
                int windowLen = right - left + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    minStart = left;
                }

                char lc = s.charAt(left);
                need[lc]++;
                if (need[lc] > 0) { // we just removed a needed char
                    required++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}